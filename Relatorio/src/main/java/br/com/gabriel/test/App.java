package br.com.gabriel.test;

import java.util.ArrayList;
import java.util.List;

import relatorio.controller.RelatorioController;
import relatorio.service.model.Produto;
import relatorio.service.model.Relatorio;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Construindo os dados que vão ser impressos no rolê
		Produto produto1 = new Produto("Teclado", 20.00);
		Produto produto2 = new Produto("Mouse", 30.00);
		Produto produto3 = new Produto("Monitor", 1000.00);

		List<Produto> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);

		Relatorio relatorio = new Relatorio(1L, "Marcos", produtos);

		RelatorioController controller = new RelatorioController(relatorio);

		controller.imprimeRelatorio();

	}

}
