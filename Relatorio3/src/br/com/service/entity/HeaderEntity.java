package br.com.service.entity;

import java.time.LocalDate;

import br.com.service.model.dto.RelatorioDTO;

public class HeaderEntity {

	private LocalDate data;

	private String nomeEmpresa;

	public HeaderEntity(LocalDate data, String nomeEmpresa) {
		this.data = data;
		this.nomeEmpresa = nomeEmpresa;
	}

	public LocalDate getData() {
		return data;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void popularHeader(RelatorioDTO relatorio) {

		relatorio.setData(data);
		relatorio.setNomeEmpresa(nomeEmpresa);

	}
}
