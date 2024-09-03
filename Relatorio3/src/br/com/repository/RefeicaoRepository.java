package br.com.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.services.entity.RefeicaoEntity;
import br.com.services.model.Body;

public class RefeicaoRepository {

	public List<RefeicaoEntity> getBody() {
		List<RefeicaoEntity> refeicoes = new ArrayList<>();

		refeicoes.add(new RefeicaoEntity(1L, "Arroz e Feijão", LocalDate.of(2024, 9, 1), 500, 15.0));
		refeicoes.add(new RefeicaoEntity(2L, "Macarrão à Bolonhesa", LocalDate.of(2024, 9, 2), 700, 20.0));
		refeicoes.add(new RefeicaoEntity(3L, "Salada Caesar", LocalDate.of(2024, 9, 3), 300, 10.0));

		return refeicoes;
	}

	public List<Body> popularRelatorioDTO() {
		List<Body> relatorios = new ArrayList<>();
		for (RefeicaoEntity refeicao : getBody()) {
			relatorios.add(refeicao.popularRelatorioDTO());
		}
		return relatorios;
	}
}
