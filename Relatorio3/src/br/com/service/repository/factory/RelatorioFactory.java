package br.com.service.repository.factory;

import br.com.common.utils.TipoRelatorio;
import br.com.service.repository.OficinaRepository;
import br.com.service.repository.PessoaRepository;
import br.com.service.repository.RefeicaoRepository;
import br.com.service.repository.interfaces.RelatorioRepository;

public class RelatorioFactory {

	public RelatorioRepository getRepository(TipoRelatorio relatorio) {

		switch (relatorio) {
		case PESSOA:
			return new PessoaRepository();
		case REFEICAO:
			return new RefeicaoRepository();
		case OFICINA:
			return new OficinaRepository();
		default:
			throw new IllegalArgumentException("Tipo de relatório desconhecido: ");
		}
	}
}
