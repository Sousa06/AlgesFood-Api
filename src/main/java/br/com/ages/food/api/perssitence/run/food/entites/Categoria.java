package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: Categoria
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Table(name = "cliente", schema = "algesfood")
@Entity
public class Categoria implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Column(name = "cat_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "cat_versao")
	private Long versao;
	@Column(name = "cat_nome")
	private String nome;
	private static final long serialVersionUID = 1L;
	
	//Mapeamento dos relacionamentos
	@ManyToOne
	@JoinColumn(name = "cat_categoria_pai_id")
	Categoria categoria_pai;
     
	@OneToMany(mappedBy = "categoria_pai")
	List<Categoria> categorias = new ArrayList<>();
	
    Categoria(Long versao, String nome) {

		this.versao = versao;
		this.nome = nome;
	}

}
