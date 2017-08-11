package servicio.demo.servicio;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import servicio.demo.output.Cliente;

@Path("/")
@Produces({ "application/json" })
@Consumes({ "application/json" })
@RolesAllowed("restuser")
public class ClienteService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ClienteService.class);
	
	@GET
	@Path("/clientes")
	public Response clientes(@QueryParam("q") final String q) {
		LOG.debug("[clientes][q->{}]",new Object[]{q} );
		return Response.ok(null).build();				
	}

	@GET
	@Path("/cliente/{dni}")
	public Response obtenerCliente(@PathParam("dni") final String dni) {
		LOG.debug("[obtenerCliente][dni->{}]",new Object[]{dni} );
		return Response.ok(null).build();
	}

	@POST
	@Path("/cliente")
	public Response registrarCliente(final Cliente cliente) {
		LOG.debug("[registrarCliente][cliente->{}]",new Object[]{cliente} );
		return Response.ok(null).build();
	}

	@PUT
	@Path("/cliente/{dni}")
	public Response actualizarCliente(@PathParam("dni") final String dni, final Cliente cliente) {
		LOG.debug("[actualizarCliente][dni->{}][cliente->{}]",new Object[]{dni,cliente} );
		return Response.ok(null).build();
	}

	@DELETE
	@Path("/cliente/{dni}")
	public Response eliminarCliente(@PathParam("dni") final String dni) {
		LOG.debug("[actualizarCliente][dni->{}]",new Object[]{dni} );
		return Response.ok(null).build();
	}

}
