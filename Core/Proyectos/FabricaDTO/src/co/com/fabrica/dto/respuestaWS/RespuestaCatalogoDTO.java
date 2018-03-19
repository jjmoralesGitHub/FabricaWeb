package co.com.fabrica.dto.respuestaWS;

import java.io.Serializable;
import java.util.List;

import co.com.fabrica.dto.parametroWS.ArticuloDTO;
import co.com.fabrica.dto.parametroWS.TipoIdentificacionDTO;

public class RespuestaCatalogoDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ArticuloDTO> articulos;
	private List<TipoIdentificacionDTO> tiposIdentificaci�n;
	
	public RespuestaCatalogoDTO() {
	}
	public RespuestaCatalogoDTO(List<ArticuloDTO> articulos, List<TipoIdentificacionDTO> tiposIdentificaci�n) {
		super();
		this.articulos = articulos;
		this.tiposIdentificaci�n = tiposIdentificaci�n;
	}
	public List<ArticuloDTO> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<ArticuloDTO> articulos) {
		this.articulos = articulos;
	}
	public List<TipoIdentificacionDTO> getTiposIdentificaci�n() {
		return tiposIdentificaci�n;
	}
	public void setTiposIdentificaci�n(List<TipoIdentificacionDTO> tiposIdentificaci�n) {
		this.tiposIdentificaci�n = tiposIdentificaci�n;
	}
	
	

}
