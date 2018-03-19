package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TIPOIDENTIFICACION database table.
 * 
 */
@Entity
@NamedQuery(name="Tipoidentificacion.findAll", query="SELECT t FROM Tipoidentificacion t")
@Table(name = "TIPOIDENTIFICACION")
public class Tipoidentificacion implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private BigDecimal id;

	private String nombre;

	public Tipoidentificacion() {
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