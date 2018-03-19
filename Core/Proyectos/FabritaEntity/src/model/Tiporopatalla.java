package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TIPOROPATALLA database table.
 * 
 */
@Entity
@NamedQuery(name="Tiporopatalla.findAll", query="SELECT t FROM Tiporopatalla t")
@Table(name = "TIPOROPATALLA")
public class Tiporopatalla implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String column1;

	private BigDecimal idtiporopa;

	public Tiporopatalla() {
	}

	public String getColumn1() {
		return this.column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public BigDecimal getIdtiporopa() {
		return this.idtiporopa;
	}

	public void setIdtiporopa(BigDecimal idtiporopa) {
		this.idtiporopa = idtiporopa;
	}

}