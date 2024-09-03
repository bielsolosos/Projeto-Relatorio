package br.com.services.entity;

import java.util.HashMap;
import java.util.Map;

import br.com.services.interfaces.Relatorio;
import br.com.services.model.Body;

public class PessoaEntity implements Relatorio {

	private Long id;
	private String nomes;
	private String cpfs;
	private Integer idades;
	private String enderecos;

	public PessoaEntity(Long id, String nomes, String cpfs, Integer idades, String enderecos) {
		this.id = id;
		this.nomes = nomes;
		this.cpfs = cpfs;
		this.idades = idades;
		this.enderecos = enderecos;
	}

	@Override
	public Map<String, Object> getDetalhes() {
		Map<String, Object> detalhes = new HashMap<>();
		detalhes.put("id", id);
		detalhes.put("nomes", nomes);
		detalhes.put("cpfs", cpfs);
		detalhes.put("idades", idades);
		detalhes.put("enderecos", enderecos);
		return detalhes;
	}

	@Override
	public Body popularRelatorioDTO() {
		return new Body(id, nomes, cpfs, enderecos, null);
	}

}
