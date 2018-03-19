package co.com.fabrica.dto.respuestaWS;

import java.io.Serializable;

public class RespuestaPedidoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroPedido;
	private String codigo;
	private String descripcion;
	
	public RespuestaPedidoDTO(int numeroPedido, String codigo, String descripcion) {
		super();
		this.numeroPedido = numeroPedido;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
