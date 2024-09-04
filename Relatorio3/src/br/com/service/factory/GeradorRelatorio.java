package br.com.service.factory;

import java.util.List;

import br.com.common.utils.TipoRelatorio;
import br.com.service.entity.FooterEntity;
import br.com.service.entity.HeaderEntity;
import br.com.service.interfaces.Relatorio;
import br.com.service.model.dto.RelatorioDTO;
import br.com.service.repository.FooterRepository;
import br.com.service.repository.HeaderRepository;
import br.com.service.repository.factory.RelatorioFactory;

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