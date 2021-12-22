package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
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
 * Entity implementation class for Entity: PagamentoBoleto
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Entity
public class PagamentoBoleto implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate dataVencimento;
	private String codigoDeBarra;
	private static final long serialVersionUID = 1L;

	public PagamentoBoleto(LocalDate dataVencimento, String codigoDeBarra) {

		this.dataVencimento = dataVencimento;
		this.codigoDeBarra = codigoDeBarra;
	}

}
