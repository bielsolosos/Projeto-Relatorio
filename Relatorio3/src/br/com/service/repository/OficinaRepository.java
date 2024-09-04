package br.com.service.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.service.entity.OficinaEntity;
import br.com.service.interfaces.Relatorio;
import br.com.service.repository.interfaces.RelatorioRepository;

public class OficinaRepository implements RelatorioRepository {
	
	@Override
	public List<Relatorio> getRelatorios() {
		List<Relatorio> oficinas = new ArrayList<>();

		oficinas.add(new OficinaEntity(1L, "Oficina do João", "Troca de óleo", 150.0, "Fiat Uno"));
		oficinas.add(
				new OficinaEntity(2L, "Mecânica São Pedro", "Alinhamento e balanceamento", 250.0, "Volkswagen Golf"));
		oficinas.add(new OficinaEntity(3L, "Auto Center", "Revisão completa", 450.0, "Toyota Corolla"));

		return oficinas;
	}

	
}
