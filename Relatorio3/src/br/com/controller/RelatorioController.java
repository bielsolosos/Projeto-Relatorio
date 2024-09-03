package br.com.controller;

import br.com.common.utils.TipoRelatorio;
import br.com.services.RelatorioService;

public class RelatorioController {
	 
	private RelatorioService service;

	public RelatorioController() {
		this.service = new RelatorioService();
	}
	
	public void imprimirRelatorio(TipoRelatorio relatorio) {
		System.out.println(service.geraRelatorio(relatorio));
	}
	
}
