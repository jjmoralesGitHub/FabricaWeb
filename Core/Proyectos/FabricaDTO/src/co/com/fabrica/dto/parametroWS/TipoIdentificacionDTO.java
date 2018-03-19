package co.com.fabrica.dto.parametroWS;

import java.io.Serializable;

public class TipoIdentificacionDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8065363951221267003L;
	private int id;
	private String nombre;
	
	public TipoIdentificacionDTO(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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
	
	
	

}
