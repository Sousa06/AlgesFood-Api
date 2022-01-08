package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: ItemPedidoPK
 *
 */
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ItemPedidoPK implements Serializable {
     
	
	private Integer pedidoId;

	private Integer produtoId;
	private static final long serialVersionUID = 1L;

	
   
}
