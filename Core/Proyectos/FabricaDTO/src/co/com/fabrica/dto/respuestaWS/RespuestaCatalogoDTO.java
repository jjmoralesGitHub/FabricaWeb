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
	private List<TipoIdentificacionDTO> tiposIdentificación;
	
	public RespuestaCatalogoDTO() {
	}
	public RespuestaCatalogoDTO(List<ArticuloDTO> articulos, List<TipoIdentificacionDTO> tiposIdentificación) {
		super();
		this.articulos = articulos;
		this.tiposIdentificación = tiposIdentificación;
	}
	public List<ArticuloDTO> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<ArticuloDTO> articulos) {
		this.articulos = articulos;
	}
	public List<TipoIdentificacionDTO> getTiposIdentificación() {
		return tiposIdentificación;
	}
	public void setTiposIdentificación(List<TipoIdentificacionDTO> tiposIdentificación) {
		this.tiposIdentificación = tiposIdentificación;
	}
	
	

}
