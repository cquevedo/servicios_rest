package servicio.demo.servicio;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/")
@Produces({ "application/json" })
@Consumes({ "application/json" })
@RolesAllowed("restuser")
public class ClienteService {

	@GET
	@Path("/clientes")
	public Response consultarClientes(){
		return Response.ok("Hola Mundo").build();
	}

}
