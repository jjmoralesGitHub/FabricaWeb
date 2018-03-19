package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TIPOROPACOLOR database table.
 * 
 */
@Entity
@NamedQuery(name="Tiporopacolor.findAll", query="SELECT t FROM Tiporopacolor t")
@Table(name = "TIPOROPACOLOR")
public class Tiporopacolor implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String color;
	
	private BigDecimal idtiporopa;

	public Tiporopacolor() {
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getIdtiporopa() {
		return this.idtiporopa;
	}

	public void setIdtiporopa(BigDecimal idtiporopa) {
		this.idtiporopa = idtiporopa;
	}

}