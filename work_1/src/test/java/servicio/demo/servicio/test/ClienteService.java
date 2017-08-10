package servicio.demo.servicio.test;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/")
@Produces({ "application/json" })
@Consumes({ "application/json" })
public interface ClienteService {
	
	@GET
	@Path("/clientes")
	public Response consultarClientes();
	
}

