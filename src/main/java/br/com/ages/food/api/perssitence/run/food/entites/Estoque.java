package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Estoque
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Entity
public class Estoque implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long quantidade;
	private Long versao;
	private static final long serialVersionUID = 1L;

	public Estoque(Long quantidade, Long versao) {
		super();
		this.quantidade = quantidade;
		this.versao = versao;
	}

}
