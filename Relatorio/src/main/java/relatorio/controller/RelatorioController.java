package relatorio.controller;

import relatorio.service.RelatorioService;
import relatorio.service.model.Relatorio;

public class RelatorioController {

	private RelatorioService relatorioService;

	public RelatorioController(Relatorio relatorio) {
		this.relatorioService = new RelatorioService(relatorio);
	}

	public void imprimeRelatorio() {
		System.out.println(relatorioService.getRelatorio().toString());
	}
}
