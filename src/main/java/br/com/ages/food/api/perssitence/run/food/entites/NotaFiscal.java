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
@Entity
public class NotaFiscal implements Serializable {

	@Setter(value = AccessLevel.NONE)
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Byte xml;
	private LocalDate dataEmissao;
	private Long versao;
	private static final long serialVersionUID = 1L;

	public NotaFiscal(Byte xml, LocalDate dataEmissao, Long versao) {
		super();
		this.xml = xml;
		this.dataEmissao = dataEmissao;
		this.versao = versao;
	}

}
