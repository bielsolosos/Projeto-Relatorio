package relatorio.service.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido {

	private Long id;

	private Cliente cliente;

	private List<Produto> produtos;

	public Pedido(Long id, Cliente cliente, List<Produto> produtos, LocalDate data) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
