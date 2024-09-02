package br.com.gabriel;

import br.com.controller.RelatorioController;
import br.com.gabriel.utils.BodyENUMS;

public class app {

	public static void main(String[] args) {

		RelatorioController api = new RelatorioController();
		
		api.imprimirRelatorio(BodyENUMS.GENERICO);
	}

}
