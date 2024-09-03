package br.com.service.factory;

import java.util.List;

import br.com.common.utils.TipoRelatorio;
import br.com.service.repository.FooterRepository;
import br.com.service.repository.HeaderRepository;
import br.com.service.repository.factory.RelatorioFactory;
import br.com.services.entity.FooterEntity;
import br.com.services.entity.HeaderEntity;
import br.com.services.interfaces.Relatorio;
import br.com.services.model.dto.RelatorioDTO;

public class GeradorRelatorio {

	public RelatorioDTO criarRelatorio(TipoRelatorio tipoRelatorio) {

		
		HeaderEntity header = new HeaderRepository().getHeader();
		FooterEntity footer2 = new FooterRepository().getFooter();
		RelatorioDTO relatorioDTO = new RelatorioDTO();
		
		header.popularHeader(relatorioDTO);
		footer2.popularFooter(relatorioDTO);
		
		List<Relatorio> relatorios = new RelatorioFactory().getRepository(tipoRelatorio).getRelatorios();
		
		for (Relatorio relatorio : relatorios) {
			relatorioDTO.getBodyList().addAll(relatorio.getAtributosEmArray());
		}

		return relatorioDTO;
	}
}