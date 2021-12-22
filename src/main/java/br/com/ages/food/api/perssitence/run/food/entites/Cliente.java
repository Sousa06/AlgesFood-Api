package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDate;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Entity
public class Cliente implements Serializable {

	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.NONE)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String primeiroNome;
	private String segundoNome;
	private String cpf;
	private LocalDate dataNascimento;
	private Integer versao;
	private static final long serialVersionUID = 1L;

	public Cliente(String primeiroNome, String segundoNome, String cpf, LocalDate dataNascimento, Integer versao) {

		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.versao = versao;
	}

}
