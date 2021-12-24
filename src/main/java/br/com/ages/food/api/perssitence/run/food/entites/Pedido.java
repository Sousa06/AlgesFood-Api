package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Table(name = "pedido",schema = "algesfood")
@Entity
public class Pedido implements Serializable {

	@Setter(value = AccessLevel.NONE) 
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ped_id")
	private Long id;
	@Column(name ="ped_data_criacao")
	private LocalDateTime dataCriacao;
	@Column(name ="ped_data_ultima-atualizacao")
	private LocalDateTime dataUtlimaAtualizacao;
	@Column(name ="ped_data_conclusao")
	private LocalDateTime dataConclusao;
	@Column(name ="ped_total")
	private BigDecimal total;
	@Column(name ="ped_versao")
	private Integer versao;
	private static final long serialVersionUID = 1L;
	
	public Pedido(LocalDateTime dataCriacao, LocalDateTime dataUtlimaAtualizacao, LocalDateTime dataConclusao,
			BigDecimal total, Integer versao) {
	
		this.dataCriacao = dataCriacao;
		this.dataUtlimaAtualizacao = dataUtlimaAtualizacao;
		this.dataConclusao = dataConclusao;
		this.total = total;
		this.versao = versao;
	}
	
	
	

	
   
}
