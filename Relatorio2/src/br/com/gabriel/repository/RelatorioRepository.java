package br.com.gabriel.repository;

import br.com.gabriel.repository.interfaces.IRelatorioRepository;
import br.com.gabriel.utils.BodyENUMS;

public class RelatorioRepository implements IRelatorioRepository {

	@Override
	public BodyENUMS getbody(BodyENUMS corpo) {
		return corpo;
	}

}
