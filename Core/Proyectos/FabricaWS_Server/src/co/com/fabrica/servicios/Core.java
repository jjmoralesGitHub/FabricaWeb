package co.com.fabrica.servicios;

import java.util.ArrayList;
import java.util.List;

import co.com.fabrica.dto.parametroWS.ArticuloDTO;
import co.com.fabrica.dto.parametroWS.PedidoDTO;
import co.com.fabrica.dto.parametroWS.TipoIdentificacionDTO;
import co.com.fabrica.dto.parametroWS.TipoRopaDTO;
import co.com.fabrica.dto.respuestaWS.RespuestaCatalogoDTO;
import co.com.fabrica.dto.respuestaWS.RespuestaPedidoDTO;

public class Core {

	public RespuestaPedidoDTO registraPedido(PedidoDTO pedidoDTO) {
		/*Falta construcción de llamado a merge de objeto en la BD*/
		
		RespuestaPedidoDTO respuestaPedidoDTO = new RespuestaPedidoDTO(123456, "0", "Pedido Registrado");
		return respuestaPedidoDTO;
	}

	public RespuestaCatalogoDTO solicitaCatalogoPedido() {
		//Falta construcción de constrcción de catalagos con consulta en la BD
		List<ArticuloDTO> listaArticuloDTO = new ArrayList<ArticuloDTO>();
		
		List<String> listaColoresTipoRopa1 = new ArrayList<String>();
		listaColoresTipoRopa1.add("Amarillo");
		listaColoresTipoRopa1.add("Azul");
		listaColoresTipoRopa1.add("Rojo");
		listaColoresTipoRopa1.add("Negro");
		listaColoresTipoRopa1.add("Balnco");
		listaColoresTipoRopa1.add("Verde");
		
		List<String> listaTallasTipoRopa1 = new ArrayList<String>();
		listaTallasTipoRopa1.add("8");
		listaTallasTipoRopa1.add("12");
		listaTallasTipoRopa1.add("29");
		listaTallasTipoRopa1.add("30");
		listaTallasTipoRopa1.add("32");
		
		TipoRopaDTO tipoRopa1DTO=new TipoRopaDTO(1, listaColoresTipoRopa1, listaTallasTipoRopa1);
		
		List<String> listaColoresTipoRopa2 = new ArrayList<String>();
		listaColoresTipoRopa2.add("Azul");
		listaColoresTipoRopa2.add("Rojo");
		listaColoresTipoRopa2.add("Negro");
		listaColoresTipoRopa2.add("Balnco");
		
		List<String> listaTallasTipoRopa2 = new ArrayList<String>();
		listaTallasTipoRopa2.add("S");
		listaTallasTipoRopa2.add("M");
		listaTallasTipoRopa2.add("L");
		listaTallasTipoRopa2.add("XL");
		
		TipoRopaDTO tipoRopa2DTO=new TipoRopaDTO(1, listaColoresTipoRopa2, listaTallasTipoRopa2);
		
		List<String> listaColoresTipoRopa3 = new ArrayList<String>();
		listaColoresTipoRopa3.add("Cafe");
		listaColoresTipoRopa3.add("Negro");
		
		List<String> listaTallasTipoRopa3 = new ArrayList<String>();
		listaTallasTipoRopa3.add("S");
		listaTallasTipoRopa3.add("M");
		listaTallasTipoRopa3.add("L");
		
		TipoRopaDTO tipoRopa3DTO=new TipoRopaDTO(1, listaColoresTipoRopa3, listaTallasTipoRopa3);
		
		ArticuloDTO articuloDTO= new ArticuloDTO(100001, "Pantalon Paño", "Descripción pantalón paño", 
				"50.000", tipoRopa1DTO, "_Imagenes_TipoRopa1_articulo100001.jpg", "", "", 0);
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(100002, "Pantalon Lino", "Descripción pantalón lino", 
				"60.000", tipoRopa1DTO, "_Imagenes_TipoRopa1_articulo100002.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(100003, "Pantalon Algodón", "Descripción pantalón algodón", 
				"70.000", tipoRopa1DTO, "_Imagenes_TipoRopa1_articulo100003.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(100004, "Pantalon Lana", "Descripción pantalón lana", 
				"80.000", tipoRopa1DTO, "_Imagenes_TipoRopa1_articulo100004.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		//------------------------------------------------------
		articuloDTO= new ArticuloDTO(200001, "Camisa Italiana", "Descripción camisa Italiana", 
				"50.000", tipoRopa2DTO, "_Imagenes_TipoRopa2_articulo200001.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(200002, "Camisa Americana", "Descripción camisa americana", 
				"60.000", tipoRopa2DTO, "_Imagenes_TipoRopa2_articulo200002.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(200003, "Camisa Francés", "Descripción camisa Francés", 
				"70.000", tipoRopa2DTO, "_Imagenes_TipoRopa2_articulo200003.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(200004, "Camisa Club", "Descripción camisa club", 
				"80.000", tipoRopa2DTO, "_Imagenes_TipoRopa2_articulo200004.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		//------------------------------------------------------
		articuloDTO= new ArticuloDTO(300001, "Chaqueta Trenca", "Descripción chaqueta trenca", 
				"50.000", tipoRopa3DTO, "_Imagenes_TipoRopa3_articulo300001.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(300002, "Chaqueta Cuero", "Descripción chaqueta cuero", 
				"60.000", tipoRopa3DTO, "_Imagenes_TipoRopa3_articulo300002.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(300003, "Chaqueta Traje", "Descripción chaqueta traje", 
				"70.000", tipoRopa3DTO, "_Imagenes_TipoRopa3_articulo300003.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		articuloDTO= new ArticuloDTO(300004, "Chaqueta Invierno", "Descripción chaqueta invierno", 
				"80.000", tipoRopa3DTO, "_Imagenes_TipoRopa3_articulo300004.jpg", "", "", 0);
		
		listaArticuloDTO.add(articuloDTO);
		
		
		List<TipoIdentificacionDTO> listaTipoIdentificacionDTO = new ArrayList<TipoIdentificacionDTO>();
		
		TipoIdentificacionDTO tipoIdentificacionDTO = new TipoIdentificacionDTO(1, "Cédula");
		listaTipoIdentificacionDTO.add(tipoIdentificacionDTO);
		tipoIdentificacionDTO = new TipoIdentificacionDTO(2, "Cédula Extranjería");
		listaTipoIdentificacionDTO.add(tipoIdentificacionDTO);
		tipoIdentificacionDTO = new TipoIdentificacionDTO(3, "Tarjeta de Identidad o NUIP");
		listaTipoIdentificacionDTO.add(tipoIdentificacionDTO);
		
		RespuestaCatalogoDTO respuestaCatalogoDTO = new RespuestaCatalogoDTO(listaArticuloDTO, listaTipoIdentificacionDTO);
		return respuestaCatalogoDTO;
	}

}
