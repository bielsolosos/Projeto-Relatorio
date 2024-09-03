package br.com.services.interfaces;

import java.util.ArrayList;

import br.com.services.model.Body;

public interface Relatorio {


    Body popularRelatorioDTO();
    
    ArrayList<String> getAtributosEmArray();
}
