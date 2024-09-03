package br.com.services.entity;

import java.util.ArrayList;

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
	public Body popularRelatorioDTO() {
		return new Body(id, nomesOficina, servicos, veiculos, precos);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<String> getAtributosEmArray() {
		@SuppressWarnings("rawtypes")
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(this.nomesOficina);
		arrayList.add(this.servicos);
		arrayList.add(this.precos.toString());
		arrayList.add(this.veiculos);
		return arrayList;
	}
}
