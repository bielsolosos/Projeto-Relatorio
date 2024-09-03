package br.com.services.model;

public class Body {

	private Long id;
	private String nome;
	private String descricao;
	private String detalhe;
	private Double valor;
	
	public Body(Long id, String nome, String descricao, String detalhe, Double valor) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.detalhe = detalhe;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public Double getValor() {
		return valor;
	}
}
