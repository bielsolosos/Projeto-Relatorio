package br.com.service.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.service.entity.EstagiarioEntity;
import br.com.service.entity.interfaces.Funcionario;
import br.com.service.repository.interfaces.FuncionarioRepository;

public class EstagiarioRepository implements FuncionarioRepository {

	//Mais para frente fazer leitor e escritor de arquivos aqui!
	@Override
	public List<Funcionario> getFuncionarios() {
        // Criando uma lista de estagiários
        List<Funcionario> estagiarios = new ArrayList<>();

        // Populando a lista com alguns estagiários fictícios
        estagiarios.add(new EstagiarioEntity(1L, "Gabriel Silva", "Universidade Federal de São Paulo", 1500.00));
        estagiarios.add(new EstagiarioEntity(2L, "Ana Costa", "Universidade Estadual de Campinas", 1600.00));
        estagiarios.add(new EstagiarioEntity(3L, "Lucas Oliveira", "Universidade de São Paulo", 1550.00));
        estagiarios.add(new EstagiarioEntity(4L, "Mariana Souza", "Pontifícia Universidade Católica", 1400.00));
        estagiarios.add(new EstagiarioEntity(5L, "Ricardo Pereira", "Mackenzie", 1450.00));

        return estagiarios;
	}

}
