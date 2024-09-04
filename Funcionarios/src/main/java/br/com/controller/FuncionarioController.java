package br.com.controller;

import br.com.common.TipoFuncionario;
import br.com.service.FuncionarioService;

public class FuncionarioController {
	
	private FuncionarioService service;

	public FuncionarioController() {
		this.service = new FuncionarioService();
	}
	
	public void getFuncionarios(TipoFuncionario funcionario) {
		System.out.println(service.getFuncionarios(funcionario));
	}
}
