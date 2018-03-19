package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ARTICULO database table.
 * 
 */
@Entity
@NamedQuery(name="Articulo.findAll", query="SELECT a FROM Articulo a")
@Table(name = "ARTICULO")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;
	@Id
	private BigDecimal id;

	private BigDecimal idtiporopa;

	private String nombre;

	private String urlfoto;

	private BigDecimal valor;

	public Articulo() {
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getIdtiporopa() {
		return this.idtiporopa;
	}

	public void setIdtiporopa(BigDecimal idtiporopa) {
		this.idtiporopa = idtiporopa;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrlfoto() {
		return this.urlfoto;
	}

	public void setUrlfoto(String urlfoto) {
		this.urlfoto = urlfoto;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}