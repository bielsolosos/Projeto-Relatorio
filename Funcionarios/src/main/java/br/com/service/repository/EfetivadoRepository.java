package br.com.service.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.service.entity.EfetivadoEntity;
import br.com.service.entity.interfaces.Funcionario;
import br.com.service.repository.interfaces.FuncionarioRepository;

public class EfetivadoRepository implements FuncionarioRepository {

	@Override
	public List<Funcionario> getFuncionarios() {
		List<Funcionario> efetivados = new ArrayList<>();

		// Populando a lista com alguns funcionários efetivados
		efetivados.add(new EfetivadoEntity(1L, "André Santos", 6000.00, "Java"));
		efetivados.add(new EfetivadoEntity(2L, "Bianca Rodrigues", 6200.00, "Python"));
		efetivados.add(new EfetivadoEntity(3L, "Caio Almeida", 5800.00, "C#"));
		efetivados.add(new EfetivadoEntity(4L, "Débora Fernandes", 6400.00, "JavaScript"));

		return efetivados;
	}
}
