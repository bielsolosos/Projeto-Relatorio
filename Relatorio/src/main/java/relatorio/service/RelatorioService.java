package relatorio.service;

import relatorio.repository.RelatorioRepository;
import relatorio.service.model.Relatorio;
import relatorio.utils.PdfGenerator;

public class RelatorioService {
	
	private RelatorioRepository repository;
	private PdfGenerator generator;
	
	public RelatorioService(Relatorio relatorio) {
		this.repository = new RelatorioRepository(relatorio);
	}

	public Relatorio getRelatorio() {
		generator.gerarPdf(this.repository.getRelatorio());
		
		return this.repository.getRelatorio();
	}
}
