package br.com.service.repository.factory;

import br.com.common.TipoFuncionario;
import br.com.service.repository.EfetivadoRepository;
import br.com.service.repository.EstagiarioRepository;
import br.com.service.repository.GerenteRepository;
import br.com.service.repository.interfaces.FuncionarioRepository;

public class RepositoryFactory {

	public FuncionarioRepository retornaTipoRepository(TipoFuncionario funcionario) {
		switch(funcionario) {
		case ESTAGIARIO:
			return new EstagiarioRepository();
		case EFETIVADO:
			return new EfetivadoRepository();
		case GERENTE:
			return new GerenteRepository();
			default:
				return null;
		}
	}
}
