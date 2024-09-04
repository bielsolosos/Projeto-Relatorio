package com.br.service.model.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import lombok.Data;

@Data
public class ListaFuncionariosDTO {

    private List<String> funcionarios;
    private Integer numFuncionarios;
    private LocalDate data;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = (data != null) ? data.format(formatter) : "N/A";

        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Funcionários:\n");
        sb.append("Número de Funcionários: ").append(numFuncionarios).append("\n");
        sb.append("Data: ").append(dataFormatada).append("\n");
        sb.append("Funcionários: \n");
        if (funcionarios != null && !funcionarios.isEmpty()) {
            for (String funcionario : funcionarios) {
                sb.append(" - ").append(funcionario).append("\n");
            }
        } else {
            sb.append("Nenhum funcionário na lista.\n");
        }
        return sb.toString();
    }
}

