package br.com.service.entity;

import br.com.service.entity.interfaces.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GerenteEntity implements Funcionario {

	private Long id;
	private String nome;
	private Double salario;
	private String linguagemTrabalhada;
	private String projetoGerenciado;

	@Override
	public String getBody() {
		return "Id: " + getId().toString() + " Nome: " + getNome() + " Salario: " + getSalario().toString()
				+ " Linguagem que trabalha: " + getLinguagemTrabalhada() + " Gerencia: "
				+ getProjetoGerenciado();
	}

}
