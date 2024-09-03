package br.com.service.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.service.repository.interfaces.RelatorioRepository;
import br.com.services.entity.PessoaEntity;
import br.com.services.interfaces.Relatorio;

public class PessoaRepository implements RelatorioRepository {

	@Override
	public List<Relatorio> getRelatorios() {
		List<Relatorio> pessoas = new ArrayList<>();

		pessoas.add(new PessoaEntity(1L, "Gabriel Silva", "111.222.333-44", 28, "Rua A, 123"));
		pessoas.add(new PessoaEntity(2L, "Maria Oliveira", "555.666.777-88", 32, "Rua B, 456"));
		pessoas.add(new PessoaEntity(3L, "João Souza", "999.888.777-66", 45, "Rua C, 789"));

		return pessoas;
	}

}
