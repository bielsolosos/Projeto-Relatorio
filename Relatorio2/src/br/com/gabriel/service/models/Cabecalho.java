package br.com.gabriel.service.models;

import java.time.LocalDate;

public class Cabecalho {

	private LocalDate data = LocalDate.now();

	private String nomeEmpresa = "Vertis";

	public LocalDate getData() {
		return data;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

}
