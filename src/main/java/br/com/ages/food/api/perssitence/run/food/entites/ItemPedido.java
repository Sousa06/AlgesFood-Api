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
@Table(name = "item_pedido",schema = "algesfood")
@Entity
public class ItemPedido implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ite_id")
	private Long id;
	@Column(name = "ite_preco_produto")
	private BigDecimal precoProduto;
	@Column(name = "ite_quantidade")
	private Integer quantidade;
	@Column(name = "ite_versao")
	private Integer versao;
	private static final long serialVersionUID = 1L;

	public ItemPedido(BigDecimal precoProduto, Integer quantidade, Integer versao) {
		
		this.precoProduto = precoProduto;
		this.quantidade = quantidade;
		this.versao = versao;
	}

}
