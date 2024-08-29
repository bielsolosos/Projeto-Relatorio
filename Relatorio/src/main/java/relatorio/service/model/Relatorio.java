package relatorio.service.model;

import java.time.LocalDate;
import java.util.List;

public class Relatorio {

	private long id;
	private LocalDate data;
	private Cliente cliente;
	private List<Pedido> pedidos;

	public Relatorio() {
	}

	public Relatorio(long id, LocalDate data, Cliente cliente, List<Pedido> pedidos) {
		this.id = id;
		this.data = data;
		this.cliente = cliente;
		this.pedidos = pedidos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
