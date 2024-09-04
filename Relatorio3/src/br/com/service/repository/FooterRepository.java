package br.com.service.repository;

import br.com.service.entity.FooterEntity;

public class FooterRepository {

	public FooterEntity getFooter() {
		return new FooterEntity("TODOS OS DIREITOS RESERVADOS");
	}
}
