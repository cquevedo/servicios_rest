package servicio.demo.servicio;

import java.util.List;
import java.util.Optional;

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
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import servicio.demo.impl.ClienteImpl;
import servicio.demo.impl.ClienteImplException;
import servicio.demo.output.Cliente;
import servicio.demo.output.Error;

@Path("/")
@Produces({ "application/json" })
@Consumes({ "application/json" })
@RolesAllowed("restuser")
public class ClienteService {
	
	private static final String ERROR_SISTEMA = "1";
	private static final Logger LOG = LoggerFactory.getLogger(ClienteService.class);
	
	@GET
	@Path("/clientes")
	public Response clientes(@QueryParam("q") final String q) {
		LOG.debug("[clientes][q->{}]",new Object[]{q} );
		ClienteImpl clienteImp = new ClienteImpl();
		List<Cliente> clientes = clienteImp.listarClientes(q);
		if( !Optional.ofNullable(clientes).isPresent() || clientes.isEmpty()){
			return Response.status(Status.NOT_FOUND).build();
		}
		GenericEntity<List<Cliente>> entity = new GenericEntity<List<Cliente>>(clientes){};
		return Response.ok(entity).build();				
	}

	@GET
	@Path("/cliente/{dni}")
	public Response obtenerCliente(@PathParam("dni") final String dni) {
		LOG.debug("[obtenerCliente][dni->{}]",new Object[]{dni} );
		ClienteImpl clienteImp = new ClienteImpl();
		Cliente cliente = clienteImp.obtenerCliente(dni);
		if( !Optional.ofNullable(cliente).isPresent()){
			return Response.status(Status.NOT_FOUND).build();
		}		
		return Response.ok(cliente).build();
	}

	@POST
	@Path("/cliente")
	public Response registrarCliente(final Cliente cliente) {
		LOG.debug("[registrarCliente][cliente->{}]",new Object[]{cliente} );
		ClienteImpl clienteImp = new ClienteImpl();
		try {
			clienteImp.registrarCliente(cliente);
			return Response.status(Status.CREATED).build();
		} catch (ClienteImplException e) {
			LOG.info(e.getMessage(),e);
			Error error = new Error(e.getCodigoError(),e.getMessage());
			return Response.status(Status.BAD_REQUEST).entity(error).build();
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			Error error = new Error(ERROR_SISTEMA,e.getMessage());
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
		}		
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
