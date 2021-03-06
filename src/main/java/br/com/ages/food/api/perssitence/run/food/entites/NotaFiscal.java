package br.com.ages.food.api.perssitence.run.food.entites;

import java.io.Serializable;
import java.lang.Byte;
import java.lang.Long;
import java.time.LocalDate;
import javax.persistence.*;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity implementation class for Entity: NotaFiscal
 *
 */
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@Table(name = "nota_fiscal",schema = "algesfood")
@Entity
public class NotaFiscal implements Serializable {

	
	@EqualsAndHashCode.Include
	@Id
	private long id;
	@Column(name = "not_xml")
	private Byte xml;
	@Column(name = "not_data_emissao")
	private LocalDate dataEmissao;
	@Column(name = "not_versao")
	private Long versao;
	private static final long serialVersionUID = 1L;
	
	//Mapeamento dos relacionamentos.
	@MapsId
	@OneToOne
	@JoinColumn(name="not_pedido_ped_id")
	private Pedido pedido;

	public NotaFiscal(Byte xml, LocalDate dataEmissao, Long versao) {
		
		this.xml = xml;
		this.dataEmissao = dataEmissao;
		this.versao = versao;
	}

}
