package br.com.service.repository.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import br.com.common.TipoFuncionario;
import br.com.service.entity.EfetivadoEntity;
import br.com.service.entity.EstagiarioEntity;
import br.com.service.entity.GerenteEntity;
import br.com.service.entity.interfaces.Funcionario;

public class FileReaderUtil {

    public static List<Funcionario> lerFuncionarios(TipoFuncionario tipoFuncionario) {
        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                FileReaderUtil.class.getClassLoader().getResourceAsStream("funcionarios.txt")))) {

            String linha;

            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(";");

                if (campos[0].equalsIgnoreCase(tipoFuncionario.name())) {
                    switch (tipoFuncionario) {
                        case EFETIVADO:
                            funcionarios.add(new EfetivadoEntity(
                                Long.parseLong(campos[1]),
                                campos[2],
                                Double.parseDouble(campos[3]),
                                campos[4]
                            ));
                            break;
                        case ESTAGIARIO:
                            funcionarios.add(new EstagiarioEntity(
                                Long.parseLong(campos[1]),
                                campos[2],
                                campos[3],
                                Double.parseDouble(campos[4])
                            ));
                            break;
                        case GERENTE:
                            funcionarios.add(new GerenteEntity(
                                Long.parseLong(campos[1]),
                                campos[2],
                                Double.parseDouble(campos[3]),
                                campos[4],
                                campos[5]
                            ));
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return funcionarios;
    }
}