package co.com.fabrica.dto.parametroWS;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

public class PedidoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int tipoIdentificacion;
	private String numeroIdentificacion;
	private List<ArticuloDTO> articulos;
	private Date fechaEntrega;
	private String direccionEntrega;
	private float valorPedido;
	
	
	public PedidoDTO() {
		
	}
	
	public PedidoDTO(int id, int tipoIdentificacion, String numeroIdentificacion, List<ArticuloDTO> articulos,
			Date fechaEntrega, String direccionEntrega, float valorPedido) {
		super();
		this.id = id;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.articulos = articulos;
		this.fechaEntrega = fechaEntrega;
		this.direccionEntrega = direccionEntrega;
		this.valorPedido = valorPedido;
	}
	
	public PedidoDTO(int id, int tipoIdentificacion, String numeroIdentificacion, Date fechaEntrega,
			String direccionEntrega, float valorPedido) {
		super();
		this.id = id;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.fechaEntrega = fechaEntrega;
		this.direccionEntrega = direccionEntrega;
		this.valorPedido = valorPedido;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public List<ArticuloDTO> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<ArticuloDTO> articulos) {
		this.articulos = articulos;
	}
	
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getDireccionEntrega() {
		return direccionEntrega;
	}
	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	public float getValorPedido() {
		return valorPedido;
	}
	public void setValorPedido(float valorPedido) {
		this.valorPedido = valorPedido;
	}
	
	
	@Override
	public String toString() {
		String separador="-";
		String ret="";
		ret+="Objeto PedidoDTO:[";
		ret+=id+separador;
		ret+=tipoIdentificacion+separador;
		ret+=numeroIdentificacion+separador;
		
		for (ArticuloDTO listaObjeto : articulos) {
			ret+=listaObjeto.toString();
		}
		
		ret+=fechaEntrega.toString()+separador;
		ret+=direccionEntrega+separador;
		ret+=String.valueOf(valorPedido);
		ret+="]";
		return ret;
	}
	
}
