package br.com.service.repository.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import br.com.service.entity.EfetivadoEntity;
import br.com.service.entity.EstagiarioEntity;
import br.com.service.entity.GerenteEntity;
import br.com.service.entity.interfaces.Funcionario;

public class FileWriterUtil {

    public static void adicionarFuncionario(Funcionario funcionario) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("funcionarios.txt", true))) { 
            String linha = formatarLinha(funcionario);
            bw.write(linha);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String formatarLinha(Funcionario funcionario) {
        String linha = "";

        if (funcionario instanceof EfetivadoEntity) {
            EfetivadoEntity efetivado = (EfetivadoEntity) funcionario;
            linha = String.format("Efetivado;%d;%s;%.2f;%s", 
                                  efetivado.getId(), 
                                  efetivado.getNome(), 
                                  efetivado.getSalario(), 
                                  efetivado.getLinguagemTrabalhada());
        } else if (funcionario instanceof EstagiarioEntity) {
            EstagiarioEntity estagiario = (EstagiarioEntity) funcionario;
            linha = String.format("Estagiario;%d;%s;%s;%.2f", 
                                  estagiario.getId(), 
                                  estagiario.getNome(), 
                                  estagiario.getNomeFaculdade(), 
                                  estagiario.getSalario());
        } else if (funcionario instanceof GerenteEntity) {
            GerenteEntity gerente = (GerenteEntity) funcionario;
            linha = String.format("Gerente;%d;%s;%.2f;%s;%s", 
                                  gerente.getId(), 
                                  gerente.getNome(), 
                                  gerente.getSalario(), 
                                  gerente.getLinguagemTrabalhada(), 
                                  gerente.getProjetoGerenciado());
        }

        return linha;
    }
}
