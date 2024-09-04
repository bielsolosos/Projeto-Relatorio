package br.com.service;

import com.br.service.model.dto.ListaFuncionariosDTO;

import br.com.common.TipoFuncionario;
import br.com.service.factory.RelatorioFactory;

public class FuncionarioService {

	public ListaFuncionariosDTO getFuncionarios(TipoFuncionario funcionarios) {
		RelatorioFactory relatorioFactory = new RelatorioFactory();
		
		return relatorioFactory.getFuncionarios(funcionarios);
	}
}
