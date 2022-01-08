package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
@Table(name = "produto",schema = "algesfood")
@Entity
public class Produto implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.NONE)
	@Column(name = "pro_id")
	private Integer id;
	@Column(name = "pro_data_criacao")
	private LocalDateTime dataCriacao;
	@Column(name = "pro_data_ultima_atualizacao")
	private LocalDateTime dataUltimaAtualizacao;
	@Column(name = "pro_nome")
	private String nome;
	@Column(name = "pro_descricao")
	private String descricao;
	@Column(name = "pro_preco")
	private BigDecimal preco;
	@Column(name = "pro_ativo")
	private Boolean ativo;
	@Column(name = "pro_vercao")
	private Long vercao;
	private static final long serialVersionUID = 1L;
	
	//Mapeamento dos relacionamentos
	@ManyToMany
	@JoinTable(name = "produtos_categorias",
	joinColumns = {@JoinColumn(name = "produto_pro_id")},
	inverseJoinColumns = {@JoinColumn (name ="categoria_cat_id")}
	 )
	private List<Categoria> categorias;
	@OneToMany(mappedBy = "produto")
	private List<ItemPedido> produtos = new ArrayList<ItemPedido>();
	
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
