package br.com.service.entity;

import java.util.ArrayList;

import br.com.service.interfaces.Relatorio;

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
	public ArrayList<String> getAtributosEmArray() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(this.id.toString());
		arrayList.add(this.nomes);
		arrayList.add(this.cpfs);
		arrayList.add(this.idades.toString());
		arrayList.add(this.enderecos);
		return arrayList;
	}
}
