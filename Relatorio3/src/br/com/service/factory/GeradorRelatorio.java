package br.com.service.factory;

import java.util.List;

import br.com.common.utils.TipoRelatorio;
import br.com.repository.FooterRepository;
import br.com.repository.HeaderRepository;
import br.com.repository.PessoaRepository;
import br.com.repository.RefeicaoRepository;
import br.com.services.model.Body;
import br.com.services.model.dto.RelatorioDTO;

public class GeradorRelatorio {

	public RelatorioDTO criarRelatorio(TipoRelatorio tipoRelatorio) {
		HeaderRepository header = new HeaderRepository();
		FooterRepository footer = new FooterRepository();
		List<Body> bodyList = null;

		switch (tipoRelatorio) {
		case PESSOA:
			PessoaRepository repository = new PessoaRepository();
			bodyList = repository.popularRelatorioDTO();
			break;
		case REFEICAO:
			RefeicaoRepository repository2 = new RefeicaoRepository();
			bodyList = repository2.popularRelatorioDTO();
			break;
		case OFICINA:
			RefeicaoRepository repository3 = new RefeicaoRepository();
			bodyList = repository3.popularRelatorioDTO();
			break;
		default:
			throw new IllegalArgumentException("Tipo de relatório desconhecido: " + tipoRelatorio);
		}

		return new RelatorioDTO(header.getHeader(), bodyList, footer.getFooter());
	}
}