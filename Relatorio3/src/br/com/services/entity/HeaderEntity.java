package br.com.services.entity;

import java.time.LocalDate;

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

}
