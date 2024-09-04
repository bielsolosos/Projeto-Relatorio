package br.com.service.repository;

import java.time.LocalDate;

import br.com.service.entity.HeaderEntity;

public class HeaderRepository {

	public HeaderEntity getHeader() {
		return new HeaderEntity(LocalDate.now(), "Vertis Solutions");
	}
}
