package br.com.gabriel.service;

import br.com.gabriel.repository.RelatorioRepository;
import br.com.gabriel.service.factory.GeradorRelatorio;
import br.com.gabriel.utils.BodyENUMS;

public class RelatorioService {

	private RelatorioRepository repository;

	public RelatorioService() {
		this.repository = new RelatorioRepository();
	}

	public String gerarRelatorio(BodyENUMS body) {

		GeradorRelatorio gerador = new GeradorRelatorio();

		return gerador.gerarRelatorio(repository.getbody(body));
	}
}
