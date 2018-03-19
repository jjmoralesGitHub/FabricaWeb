package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DETALLEPEDIDO database table.
 * 
 */
@Entity
@NamedQuery(name="Detallepedido.findAll", query="SELECT d FROM Detallepedido d")
@Table(name = "DETALLEPEDIDO")
public class Detallepedido implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal cantidad;

	private String colorseleccionado;
	@Id
	private BigDecimal idarticulo;

	private BigDecimal idpedido;

	private String tallaseleccionada;

	private BigDecimal valorarticulo;

	public Detallepedido() {
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getColorseleccionado() {
		return this.colorseleccionado;
	}

	public void setColorseleccionado(String colorseleccionado) {
		this.colorseleccionado = colorseleccionado;
	}

	public BigDecimal getIdarticulo() {
		return this.idarticulo;
	}

	public void setIdarticulo(BigDecimal idarticulo) {
		this.idarticulo = idarticulo;
	}

	public BigDecimal getIdpedido() {
		return this.idpedido;
	}

	public void setIdpedido(BigDecimal idpedido) {
		this.idpedido = idpedido;
	}

	public String getTallaseleccionada() {
		return this.tallaseleccionada;
	}

	public void setTallaseleccionada(String tallaseleccionada) {
		this.tallaseleccionada = tallaseleccionada;
	}

	public BigDecimal getValorarticulo() {
		return this.valorarticulo;
	}

	public void setValorarticulo(BigDecimal valorarticulo) {
		this.valorarticulo = valorarticulo;
	}

}