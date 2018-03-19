package co.com.fabrica.dto.parametroWS;

import java.io.Serializable;
import java.util.List;

public class TipoRopaDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private List<String> colores;
	private List<String> tallas;
	
	public TipoRopaDTO() {

	}
	
	public TipoRopaDTO(int id, List<String> colores, List<String> tallas) {
		super();
		this.id = id;
		this.colores = colores;
		this.tallas = tallas;
	}
	
	
	public List<String> getColores() {
		return colores;
	}
	public void setColores(List<String> colores) {
		this.colores = colores;
	}
	public List<String> getTallas() {
		return tallas;
	}
	public void setTallas(List<String> tallas) {
		this.tallas = tallas;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String separador="-";
		String ret="";
		ret+="Objeto ArticuloDTO:[";
		ret+=id+separador;
		
		for (String listaObjeto : colores) {
			ret+=listaObjeto+separador;
		}
		
		for (String listaObjeto : tallas) {
			ret+=listaObjeto+separador;
		}
		
		ret+="]";
		return ret;
	}
	
	
}
