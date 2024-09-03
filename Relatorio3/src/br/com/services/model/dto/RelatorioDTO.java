package br.com.services.model.dto;

import java.util.List;
import java.util.StringJoiner;

import br.com.services.entity.FooterEntity;
import br.com.services.entity.HeaderEntity;
import br.com.services.model.Body;

public class RelatorioDTO {

	private HeaderEntity header;
	private List<Body> bodyList;
	private FooterEntity footer;

	public RelatorioDTO(HeaderEntity header, List<Body> bodyList, FooterEntity footer) {
		this.header = header;
		this.bodyList = bodyList;
		this.footer = footer;
	}

	public HeaderEntity getHeader() {
		return header;
	}

	public List<Body> getBodyList() {
		return bodyList;
	}

	public FooterEntity getFooter() {
		return footer;
	}

	@Override
	public String toString() {
		// Formatando o Header
		String headerStr = String.format("Data: %s\nEmpresa: %s\n", 
			header.getData(), 
			header.getNomeEmpresa()
		);

		// Formatando o Body
		StringJoiner bodyStr = new StringJoiner("\n");
		for (Body body : bodyList) {
			bodyStr.add(String.format("ID: %d, Nome: %s, Descrição: %s, Detalhe: %s, Valor: %.2f", 
				body.getId(), 
				body.getNome(), 
				body.getDescricao(), 
				body.getDetalhe(), 
				body.getValor()
			));
		}

		// Formatando o Footer
		String footerStr = String.format("Footer: %s", footer.getFooter());

		// Unindo todas as partes
		return String.format("===== Relatório =====\n\nHeader:\n%s\nBody:\n%s\n\nFooter:\n%s", 
			headerStr, 
			bodyStr.toString(), 
			footerStr
		);
	}
}
