package br.com.gabriel.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum BodyENUMS {
	PESSOA(Arrays.asList("Thiago", "Marcio", "Marcos", "Mario")),
	REFEICAO(Arrays.asList("Feijoada", "Frango Grelhado", "Panqueca")),
	OFICINA(Arrays.asList("Oficina do seu Jorge", "Oficina do seu Julio")),
	GENERICO("É um relatório genérico mesmo fiquei sem ideias");

	private final List<String> itens;
	private final int numeroItens;

	private BodyENUMS(List<String> itens) {
		this.itens = itens;
		this.numeroItens = itens.size();
	}

	private BodyENUMS(String descricao) {
		// Peguei do Amigão ChatGPT
		this.itens = Collections.singletonList(descricao); // Cria uma lista com um único item
		this.numeroItens = 1; // Define o número de itens como 1
	}

	public List<String> getItens() {
		return itens;
	}

	public int getNumeroItens() {
		return numeroItens;
	}

}
