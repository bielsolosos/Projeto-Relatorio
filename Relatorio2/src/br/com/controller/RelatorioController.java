package br.com.controller;

import br.com.gabriel.service.RelatorioService;
import br.com.gabriel.utils.BodyENUMS;

public class RelatorioController {
	
	private RelatorioService service;

	public RelatorioController() {
		this.service = new RelatorioService();
	}
	
	public void imprimirRelatorio(BodyENUMS tipoRelatorio) {
		System.out.println(service.gerarRelatorio(tipoRelatorio));
	}
	
}
