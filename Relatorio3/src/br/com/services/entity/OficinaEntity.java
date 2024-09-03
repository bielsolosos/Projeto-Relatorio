package br.com.services.entity;

import java.util.HashMap;
import java.util.Map;

import br.com.services.interfaces.Relatorio;
import br.com.services.model.Body;

public class OficinaEntity implements Relatorio {

	private Long id;
	private String nomesOficina;
	private String servicos;
	private Double precos;
	private String veiculos;

	public OficinaEntity(Long id, String nomesOficina, String servicos, Double precos, String veiculos) {
		this.id = id;
		this.nomesOficina = nomesOficina;
		this.servicos = servicos;
		this.precos = precos;
		this.veiculos = veiculos;
	}

	@Override
	public Map<String, Object> getDetalhes() {
		Map<String, Object> detalhes = new HashMap<>();
		detalhes.put("id", id);
		detalhes.put("nomesOficina", nomesOficina);
		detalhes.put("servicos", servicos);
		detalhes.put("precos", precos);
		detalhes.put("veiculos", veiculos);
		return detalhes;
	}

	@Override
	public Body popularRelatorioDTO() {
		return new Body(id, nomesOficina, servicos, veiculos, precos);
	}
}
