package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.math.BigDecimal;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: ItemPedido
 *
 */
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Entity
public class ItemPedido implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal precoProduto;
	private Integer quantidade;
	private Integer versao;
	private static final long serialVersionUID = 1L;

	public ItemPedido(BigDecimal precoProduto, Integer quantidade, Integer versao) {
		super();
		this.precoProduto = precoProduto;
		this.quantidade = quantidade;
		this.versao = versao;
	}

}
