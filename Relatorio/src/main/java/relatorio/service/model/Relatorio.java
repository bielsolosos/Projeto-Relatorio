package relatorio.service.model;

import java.time.LocalDate;
import java.util.List;

public class Relatorio {

	private long id;
	private LocalDate data;
	private String nomeCliente;
	private List<Produto> pedidos;

	public Relatorio() {
	}

	public Relatorio(long id, String nomeCliente, List<Produto> pedidos) {
		this.id = id;
		this.data = LocalDate.now();
		this.nomeCliente = nomeCliente;
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

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public List<Produto> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Produto> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Relatorio [id=" + id + ", data=" + data + ", nomeCliente=" + nomeCliente + ", pedidos=" + pedidos + "]";
	}

	
}
