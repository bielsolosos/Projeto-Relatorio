package br.com.service.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.service.repository.interfaces.RelatorioRepository;
import br.com.services.entity.RefeicaoEntity;
import br.com.services.interfaces.Relatorio;

public class RefeicaoRepository implements RelatorioRepository {

	@Override
	public List<Relatorio> getRelatorios() {
		List<Relatorio> refeicoes = new ArrayList<>();

		refeicoes.add(new RefeicaoEntity(1L, "Arroz e Feijão", LocalDate.of(2024, 9, 1), 500, 15.0));
		refeicoes.add(new RefeicaoEntity(2L, "Macarrão à Bolonhesa", LocalDate.of(2024, 9, 2), 700, 20.0));
		refeicoes.add(new RefeicaoEntity(3L, "Salada Caesar", LocalDate.of(2024, 9, 3), 300, 10.0));

		return refeicoes;
	}
}
