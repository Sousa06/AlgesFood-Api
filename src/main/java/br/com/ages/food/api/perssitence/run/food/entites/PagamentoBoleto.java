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
@Table(name = "pagamento_boleto",schema = "algesfood")
@Entity
public class PagamentoBoleto implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pag_id")
	private Long id;
	@Column(name = "pag_data_vencimento")
	private LocalDate dataVencimento;
	@Column(name = "pag_codigo_de_barra")
	private String codigoDeBarra;
	private static final long serialVersionUID = 1L;

	public PagamentoBoleto(LocalDate dataVencimento, String codigoDeBarra) {

		this.dataVencimento = dataVencimento;
		this.codigoDeBarra = codigoDeBarra;
	}

}
