package relatorio.service;

import relatorio.repository.RelatorioRepository;
import relatorio.service.model.Relatorio;
import relatorio.utils.PdfGenerator;

public class RelatorioService {
	
	private RelatorioRepository repository;
	private PdfGenerator generator;
	
	public RelatorioService(Relatorio relatorio) {
		this.repository = new RelatorioRepository(relatorio);
		this.generator = new PdfGenerator();
	}

	public Relatorio getRelatorio() {
		generator.gerarPdf(repository.getRelatorio());
		
		return repository.getRelatorio();
	}
}
