package br.com.service.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.service.entity.GerenteEntity;
import br.com.service.entity.interfaces.Funcionario;
import br.com.service.repository.interfaces.FuncionarioRepository;

public class GerenteRepository implements FuncionarioRepository {

	@Override
	public List<Funcionario> getFuncionarios() {
		List<Funcionario> gerentes = new ArrayList<>();

		// Populando a lista com alguns gerentes
		gerentes.add(new GerenteEntity(1L, "Lucas Martins", 8000.00, "Java", "Sistema de Gestão Financeira"));
		gerentes.add(new GerenteEntity(2L, "Fernanda Costa", 8500.00, "Python", "Plataforma de E-commerce"));
		gerentes.add(new GerenteEntity(3L, "Ricardo Souza", 9000.00, "C#", "Aplicativo de Saúde"));
		gerentes.add(new GerenteEntity(4L, "Juliana Lima", 9500.00, "JavaScript", "Sistema de CRM"));

		return gerentes;
	}
}
