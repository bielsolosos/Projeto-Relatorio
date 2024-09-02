package relatorio.utils;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import relatorio.service.model.Relatorio;
import relatorio.service.model.Produto;

public class PdfGenerator {

    public void gerarPdf(Relatorio relatorio) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("relatorio_" + relatorio.getId() + ".pdf"));
            document.open();

            // Adicionando as informações principais do Relatório
            document.add(new Paragraph("Relatório ID: " + relatorio.getId()));
            document.add(new Paragraph("Data: " + relatorio.getData()));
            document.add(new Paragraph("Cliente: " + relatorio.getNomeCliente()));
            document.add(new Paragraph("\nProdutos:"));

            // Iterando sobre os produtos e adicionando ao documento
            for (Produto produto : relatorio.getPedidos()) {
                document.add(new Paragraph(" - " + produto.getNome() + " : " + produto.getPreco()));
            }

            document.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
