package br.com.repository;

import java.time.LocalDate;

import br.com.services.entity.HeaderEntity;

public class HeaderRepository {

	public HeaderEntity getHeader() {
		return new HeaderEntity(LocalDate.now(), "Vertis Solutions");
	}
}
