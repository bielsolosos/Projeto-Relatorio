package br.com.service.entity;

import br.com.service.model.dto.RelatorioDTO;

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
