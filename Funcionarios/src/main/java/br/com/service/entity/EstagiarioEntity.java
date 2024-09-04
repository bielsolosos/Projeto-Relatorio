package br.com.service.entity;

import br.com.service.entity.interfaces.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EstagiarioEntity implements Funcionario {

	private Long id;
	private String nome;
	private String nomeFaculdade;
	private Double salario;

	@Override
	public String getBody() {
		return "Id: " + getId().toString() + " Nome: " + getNome() + " Nome da Faculdade: " + getNomeFaculdade()
				+ "Salario: " + getSalario().toString();
	}

}
