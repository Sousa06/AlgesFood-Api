package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDate;
import javax.persistence.*;

import br.com.ages.food.api.perssitence.run.food.entites.api.enums.SexoCliente;
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
@Table(name = "cliente",schema = "algesfood")
@Entity
public class Cliente implements Serializable {

	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.NONE)
	@Id
	@Column(name = "cli_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "cli_primeiro_nome")
	private String primeiroNome;
	@Column(name = "cli_segundo_nome")
	private String segundoNome;
	@Column(name = "cli_cpf")
	private String cpf;
	@Column(name = "cli_data_nascimento")
	private LocalDate dataNascimento;
	@Column(name = "cli_versao")
	private Integer versao;
	private static final long serialVersionUID = 1L;
	
	//Atributos do relacionamento.
	@Enumerated(EnumType.STRING)
	private SexoCliente sexo;

	public Cliente(String primeiroNome, String segundoNome, String cpf, LocalDate dataNascimento, Integer versao) {

		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.versao = versao;
	}

}
