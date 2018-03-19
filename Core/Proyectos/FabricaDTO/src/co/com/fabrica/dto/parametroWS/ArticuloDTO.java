package co.com.fabrica.dto.parametroWS;

import java.io.Serializable;

public class ArticuloDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String descripcion;
	private String valor;
	private TipoRopaDTO tipoRopaDTO;
	private String urlFoto;
	private String tallaSeleccionada;
	private String colorSeleccionado;	
	private int cantidad;
	
	public ArticuloDTO() {
	}
	
	public ArticuloDTO(int id, String nombre, String descripcion, String valor, TipoRopaDTO tipoRopaDTO, String urlFoto,
			String tallaSeleccionada, String colorSeleccionado, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.valor = valor;
		this.tipoRopaDTO = tipoRopaDTO;
		this.urlFoto = urlFoto;
		this.tallaSeleccionada = tallaSeleccionada;
		this.colorSeleccionado = colorSeleccionado;
		this.cantidad = cantidad;
	}
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	public String getTallaSeleccionada() {
		return tallaSeleccionada;
	}
	public void setTallaSeleccionada(String tallaSeleccionada) {
		this.tallaSeleccionada = tallaSeleccionada;
	}
	public String getColorSeleccionado() {
		return colorSeleccionado;
	}
	public void setColorSeleccionado(String colorSeleccionado) {
		this.colorSeleccionado = colorSeleccionado;
	}
	public TipoRopaDTO getTipoRopaDTO() {
		return tipoRopaDTO;
	}
	public void setTipoRopaDTO(TipoRopaDTO tipoRopaDTO) {
		this.tipoRopaDTO = tipoRopaDTO;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String separador="-";
		String ret="";
		ret+="Objeto ArticuloDTO:[";
		ret+=id+separador;
		
		ret+=nombre+separador;
		ret+=descripcion+separador;
		ret+=valor+separador;
		
		ret+=tipoRopaDTO.toString();
		
		ret+=urlFoto+separador;
		ret+=tallaSeleccionada+separador;
		ret+=colorSeleccionado+separador;	
		ret+=String.valueOf(cantidad);
		
		ret+="]";
		return ret;
	}
	
	

}
