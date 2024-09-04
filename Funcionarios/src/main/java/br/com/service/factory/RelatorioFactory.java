package br.com.service.factory;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.br.service.model.dto.ListaFuncionariosDTO;

import br.com.common.TipoFuncionario;
import br.com.service.entity.interfaces.Funcionario;
import br.com.service.repository.factory.RepositoryFactory;
import br.com.service.repository.interfaces.FuncionarioRepository;

public class RelatorioFactory {

	public ListaFuncionariosDTO getFuncionarios(TipoFuncionario funcionario) {

		// Orientação a Objetos linda!
		FuncionarioRepository repository = new RepositoryFactory().retornaTipoRepository(funcionario);

		ListaFuncionariosDTO listaFuncionariosDTO = new ListaFuncionariosDTO();

		// Setar os dados padrões do rolê
		listaFuncionariosDTO.setData(LocalDate.now());
		listaFuncionariosDTO.setNumFuncionarios(repository.getFuncionarios().size());

		// Nem sei fazer isso daqui mas pra deixar pequenininho pedi o Chat meter um
		// lambda pra mim!
		List<String> funcionariosBody = repository.getFuncionarios().stream().map(Funcionario::getBody)
				.collect(Collectors.toList());

		listaFuncionariosDTO.setFuncionarios(funcionariosBody);

		return listaFuncionariosDTO;
	}
}
