package br.com.services.entity;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import br.com.services.interfaces.Relatorio;
import br.com.services.model.Body;

public class RefeicaoEntity implements Relatorio {

    private Long id;
    private String nomes;
    private LocalDate datas;
    private Integer calorias;
    private Double precos;

    public RefeicaoEntity(Long id, String nomes, LocalDate datas, Integer calorias, Double precos) {
        this.id = id;
        this.nomes = nomes;
        this.datas = datas;
        this.calorias = calorias;
        this.precos = precos;
    }

    @Override
    public Map<String, Object> getDetalhes() {
        Map<String, Object> detalhes = new HashMap<>();
        detalhes.put("id", id);
        detalhes.put("nomes", nomes);
        detalhes.put("datas", datas);
        detalhes.put("calorias", calorias);
        detalhes.put("precos", precos);
        return detalhes;
    }

    @Override
    public Body popularRelatorioDTO() {
        return new Body(id, nomes, "Data: " + datas, "Calorias: " + calorias, precos);
    }

}
