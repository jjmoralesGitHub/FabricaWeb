package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TIPOROPA database table.
 * 
 */
@Entity
@NamedQuery(name="Tiporopa.findAll", query="SELECT t FROM Tiporopa t")
@Table(name = "TIPOROPA")
public class Tiporopa implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private BigDecimal id;

	private String nombre;

	public Tiporopa() {
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}