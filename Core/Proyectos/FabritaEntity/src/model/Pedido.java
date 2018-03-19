package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PEDIDO database table.
 * 
 */
@Entity
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p")
@Table(name = "PEDIDO")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	private String direccionentrega;

	@Temporal(TemporalType.DATE)
	private Date fechaentrega;
	@Id
	private BigDecimal id;

	@Column(name="NUMEROIDENTIFICACION_CLIENTE")
	private String numeroidentificacionCliente;

	@Column(name="TIPOIDENTIFICACION_CLIENTE")
	private BigDecimal tipoidentificacionCliente;

	private BigDecimal valorpedido;

	public Pedido() {
	}

	public String getDireccionentrega() {
		return this.direccionentrega;
	}

	public void setDireccionentrega(String direccionentrega) {
		this.direccionentrega = direccionentrega;
	}

	public Date getFechaentrega() {
		return this.fechaentrega;
	}

	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getNumeroidentificacionCliente() {
		return this.numeroidentificacionCliente;
	}

	public void setNumeroidentificacionCliente(String numeroidentificacionCliente) {
		this.numeroidentificacionCliente = numeroidentificacionCliente;
	}

	public BigDecimal getTipoidentificacionCliente() {
		return this.tipoidentificacionCliente;
	}

	public void setTipoidentificacionCliente(BigDecimal tipoidentificacionCliente) {
		this.tipoidentificacionCliente = tipoidentificacionCliente;
	}

	public BigDecimal getValorpedido() {
		return this.valorpedido;
	}

	public void setValorpedido(BigDecimal valorpedido) {
		this.valorpedido = valorpedido;
	}

}