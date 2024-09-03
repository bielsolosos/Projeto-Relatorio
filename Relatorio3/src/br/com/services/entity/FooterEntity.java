package br.com.services.entity;

import br.com.services.model.dto.RelatorioDTO;

public class FooterEntity {

	private String footer;

	public FooterEntity(String footer) {
		this.footer = footer;
	}

	public String getFooter() {
		return footer;
	}

	public void popularFooter(RelatorioDTO relatorio) {
		relatorio.setFooter(footer);
	}
}
