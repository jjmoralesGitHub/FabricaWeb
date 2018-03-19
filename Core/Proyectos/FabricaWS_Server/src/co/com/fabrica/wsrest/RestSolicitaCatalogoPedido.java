package co.com.fabrica.wsrest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import co.com.fabrica.dto.respuestaWS.RespuestaCatalogoDTO;
import co.com.fabrica.servicios.Core;


@Path("/pedido/solicitaCatalogoPedido")
public class RestSolicitaCatalogoPedido {
	
	private Core core;

	public RestSolicitaCatalogoPedido() {
		super();
		core= new Core();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response solicitaCatalogoPedido(@Context HttpServletRequest requestContext) { 
		System.out.println("Llamado a servicio rest solicitaCatalogoPedido");
		
		RespuestaCatalogoDTO respuestaDto = null;		
		respuestaDto = core.solicitaCatalogoPedido();

		Response response = Response.status(200).entity(respuestaDto)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET")
				.header("Access-Control-Max-Age", "3600")
				.header("Access-Control-Allow-Headers", "x-requested-with")
				.build();

		return response;
	}
}
