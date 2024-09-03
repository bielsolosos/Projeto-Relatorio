package br.com.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.services.entity.OficinaEntity;
import br.com.services.model.Body;

public class OficinaRepository {

	public List<OficinaEntity> getBody() {
		List<OficinaEntity> oficinas = new ArrayList<>();

		oficinas.add(new OficinaEntity(1L, "Oficina do João", "Troca de óleo", 150.0, "Fiat Uno"));
		oficinas.add(
				new OficinaEntity(2L, "Mecânica São Pedro", "Alinhamento e balanceamento", 250.0, "Volkswagen Golf"));
		oficinas.add(new OficinaEntity(3L, "Auto Center", "Revisão completa", 450.0, "Toyota Corolla"));

		return oficinas;
	}

	public List<Body> popularRelatorioDTO() {
		List<Body> relatorios = new ArrayList<>();
		for (OficinaEntity oficina : getBody()) {
			relatorios.add(oficina.popularRelatorioDTO());
		}
		return relatorios;
	}
}
