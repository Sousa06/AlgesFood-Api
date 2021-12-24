package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: PagamentoCartao
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Table(name = "pagamento_cartao",schema = "algesfood")
@Entity
public class PagamentoCartao implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pac_id")
	private Long id;
	@Column(name = "pac_numero_cartao")
	private String numeroCartao;
	@Column(name = "pac_versao")
	private Integer versao;
	private static final long serialVersionUID = 1L;

	
   
}
