package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Categoria
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Table(name = "cliente", schema = "algesfood")
@Entity
public class Categoria implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Column(name = "cat_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "cat_versao")
	private Long versao;
	@Column(name = "cat_nome")
	private String nome;
	private static final long serialVersionUID = 1L;

	public Categoria(Long versao, String nome) {

		this.versao = versao;
		this.nome = nome;
	}

}
