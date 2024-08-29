package relatorio.utils;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import relatorio.service.model.Pedido;
import relatorio.service.model.Relatorio;

public class PdfGenerator {

	public void gerarPdf(Relatorio relatorio) {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream("relatorio_" + relatorio.getId() + ".pdf"));
			document.open();

			// Adicionando as informações principais do Relatório
			document.add(new Paragraph("Relatório ID: " + relatorio.getId()));
			document.add(new Paragraph("Data: " + relatorio.getData()));
			document.add(new Paragraph("Cliente: " + relatorio.getCliente().getNome()));
			document.add(new Paragraph("\nPedidos:"));

			// Iterando sobre os pedidos e adicionando ao documento
			for (Pedido pedido : relatorio.getPedidos()) {
				document.add(new Paragraph("ID do Pedido: " + pedido.getId()));
				document.add(new Paragraph("Produtos:"));
				pedido.getProdutos().forEach(produto -> {
					try {
						document.add(new Paragraph(" - " + produto.getNome() + " : " + produto.getPreco()));
					} catch (DocumentException e) {
						e.printStackTrace();
					}
				});
				document.add(new Paragraph("\n"));
			}

			document.close();
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}
	}
}
