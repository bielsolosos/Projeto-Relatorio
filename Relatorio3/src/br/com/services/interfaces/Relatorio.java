package br.com.services.interfaces;

import java.util.Map;

import br.com.services.model.Body;

public interface Relatorio {

    Map<String, Object> getDetalhes();

    Body popularRelatorioDTO();
}
