package br.com.gabriel.service.factory;

import br.com.gabriel.service.models.Cabecalho;
import br.com.gabriel.service.models.IRelatorio;
import br.com.gabriel.service.models.Rodape;
import br.com.gabriel.utils.BodyENUMS;

public class GeradorRelatorio implements IRelatorio {

	private Cabecalho cabecalho;
	private Rodape rodape;

	public GeradorRelatorio() {
		this.cabecalho = new Cabecalho();
		this.rodape = new Rodape();
	}

	public Cabecalho getCabecalho() {
		return cabecalho;
	}

	public Rodape getRodape() {
		return rodape;
	}

	@Override
	public String gerarRelatorio(BodyENUMS body) {
		// Construindo a string do relatório no método de serviço
		StringBuilder sb = new StringBuilder();

		// Cabeçalho
		sb.append("=== Relatório ===\n");
		sb.append("Empresa: ").append(getCabecalho().getNomeEmpresa()).append("\n");
		sb.append("Data: ").append(getCabecalho().getData()).append("\n");
		sb.append("----------------------------\n");

		// Corpo
		sb.append("Corpo do Relatório:\n");
		for (String item : body.getItens()) {
			sb.append("- ").append(item).append("\n");
		}
		sb.append("----------------------------\n");

		// Rodapé
		sb.append("Rodapé:\n");
		sb.append(getRodape().getFooter()).append("\n");
		sb.append("============================\n");

		return sb.toString();
	}

}
