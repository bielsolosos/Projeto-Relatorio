package br.com.app;

import br.com.common.TipoFuncionario;
import br.com.controller.FuncionarioController;

public class App {
	public static void main(String[] args) {
		
		FuncionarioController api = new FuncionarioController();
		
		api.getFuncionarios(TipoFuncionario.GERENTE);
	}
}
