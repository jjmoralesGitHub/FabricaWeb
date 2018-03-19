package co.com.fabrica.wsrest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import co.com.fabrica.dto.parametroWS.PedidoDTO;
import co.com.fabrica.dto.respuestaWS.RespuestaPedidoDTO;
import co.com.fabrica.servicios.Core;


@Path("/pedido/registraPedido")
public class RestRegistraPedido {

	private Core core;
	
	public RestRegistraPedido() {
		super();
		core= new Core();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registraPedido(@Context HttpServletRequest requestContext, PedidoDTO pedidoDTO) { 
		System.out.println("Llamado a servicio rest registraPedido con data:" + pedidoDTO.toString());
		
		RespuestaPedidoDTO respuestaDto = null;
		
		respuestaDto= core.registraPedido(pedidoDTO);

		Response response = Response.status(200).entity(respuestaDto)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "POST, GET")
				.header("Access-Control-Max-Age", "3600")
				.header("Access-Control-Allow-Headers", "x-requested-with")
				.build();

		return response;
	}
}
