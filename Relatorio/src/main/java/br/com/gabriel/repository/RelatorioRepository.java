package relatorio.repository;

import relatorio.service.model.Relatorio;

public class RelatorioRepository implements IRelatorioRepository {

	private Relatorio relatorio;

	public RelatorioRepository(Relatorio relatorio) {
		this.relatorio = relatorio;
	}

	@Override
	public Relatorio getRelatorio() {
		return relatorio;
	}

	// Deixa isso daqui por agora mas o Marcos vai falar que tá uma merda
	@Override
	public Relatorio setRelatorio() {
		// TODO Auto-generated method stub
		return null;
	}

}
