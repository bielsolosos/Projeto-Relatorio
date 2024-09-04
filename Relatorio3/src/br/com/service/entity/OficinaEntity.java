package br.com.service.entity;

import java.util.ArrayList;

import br.com.service.interfaces.Relatorio;

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
	public ArrayList<String> getAtributosEmArray() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(this.id.toString());
		arrayList.add(this.nomesOficina);
		arrayList.add(this.servicos);
		arrayList.add(this.precos.toString());
		arrayList.add(this.veiculos);
		return arrayList;
	}
}
