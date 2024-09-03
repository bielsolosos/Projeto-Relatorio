package br.com.services.model.dto;

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

	//fazer bonitinho
	@Override
	public String toString() {
		return "RelatorioDTO [data=" + data + ", nomeEmpresa=" + nomeEmpresa + ", footer=" + footer + ", bodyList="
				+ bodyList + "]";
	}

	
	
}
