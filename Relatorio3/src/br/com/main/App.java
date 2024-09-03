package br.com.main;

import br.com.common.utils.TipoRelatorio;
import br.com.controller.RelatorioController;

public class App {

	public static void main(String[] args) {
		
		RelatorioController api = new RelatorioController();
		
		api.imprimirRelatorio(TipoRelatorio.PESSOA);
	}

}
