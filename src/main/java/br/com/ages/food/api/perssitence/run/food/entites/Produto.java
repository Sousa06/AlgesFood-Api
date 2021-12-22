package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Produto
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Entity
public class Produto implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.NONE)
	private Long id;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataUltimaAtualizacao;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private Boolean ativo;
	private Long vercao;
	private static final long serialVersionUID = 1L;
	
	public Produto(LocalDateTime dataCriacao, LocalDateTime dataUltimaAtualizacao, String nome, String descricao,
			BigDecimal preco, Boolean ativo, Long vercao) {

		this.dataCriacao = dataCriacao;
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.ativo = ativo;
		this.vercao = vercao;
	}
	
	

	
   
}
