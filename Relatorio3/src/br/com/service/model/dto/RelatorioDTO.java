package br.com.service.model.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RelatorioDTO {

	// isso aqui vem do Header
	private LocalDate data;
	private String nomeEmpresa;

	// Footer
	private String footer;

	// Body
	private List<String> bodyList = new ArrayList<>();

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public List<String> getBodyList() {
		return bodyList;
	}

	public void setBodyList(List<String> bodyList) {
		this.bodyList = bodyList;
	}

	@Override
	public String toString() {
		// Formatando o Header
		String headerStr = String.format("Data: %s\nEmpresa: %s\n", data != null ? data : "N/A",
				nomeEmpresa != null ? nomeEmpresa : "N/A");

		// Formatando o Body
		StringBuilder bodyStrBuilder = new StringBuilder();
		int blockSize = 5; // Número de elementos por linha
		for (int i = 0; i < bodyList.size(); i++) {
			if (i > 0 && i % blockSize == 0) {
				bodyStrBuilder.append("\n"); // Adiciona uma quebra de linha a cada 5 elementos
			}
			bodyStrBuilder.append(bodyList.get(i)).append(" ");
		}
		String bodyStr = bodyStrBuilder.toString().trim();
		// Formatando o Footer
		String footerStr = footer != null && !footer.isEmpty() ? footer : "Sem footer";

		// Unindo todas as partes
		return String.format("%s\nBody:\n%s\n\nFooter:\n%s", headerStr, bodyStr, footerStr);
	}

}
