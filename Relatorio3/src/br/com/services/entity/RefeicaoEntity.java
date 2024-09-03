package br.com.services.entity;

import java.time.LocalDate;
import java.util.ArrayList;

import br.com.services.interfaces.Relatorio;
import br.com.services.model.Body;

public class RefeicaoEntity implements Relatorio {

	private Long id;
	private String nomes;
	private LocalDate datas;
	private Integer calorias;
	private Double precos;

	public RefeicaoEntity(Long id, String nomes, LocalDate datas, Integer calorias, Double precos) {
		this.id = id;
		this.nomes = nomes;
		this.datas = datas;
		this.calorias = calorias;
		this.precos = precos;
	}

	@Override
	public Body popularRelatorioDTO() {
		return new Body(id, nomes, "Data: " + datas, "Calorias: " + calorias, precos);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<String> getAtributosEmArray() {
		@SuppressWarnings("rawtypes")
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(this.nomes);
		arrayList.add(this.datas.toString());
		arrayList.add(this.calorias.toString());
		arrayList.add(this.precos.toString());
		return arrayList;
	}
}
