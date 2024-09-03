package br.com.services;

import br.com.common.utils.TipoRelatorio;
import br.com.service.factory.GeradorRelatorio;
import br.com.services.model.dto.RelatorioDTO;

public class RelatorioService {

	public RelatorioDTO geraRelatorio(TipoRelatorio relatorio) {

		GeradorRelatorio gerador = new GeradorRelatorio();

		return gerador.criarRelatorio(relatorio);
	}
}
