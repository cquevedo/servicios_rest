package servicio.demo.servicio.test;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.BasicAuthentication;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.Test;


public class ClienteServiceClient {
		
	private static final String APPLICATION_JSON = "application/json";
	private static final int HTTP_OK = 200;

	@Test
	public void consultarCliente(){
		ResteasyClient client = new ResteasyClientBuilder().build();
		client.register(new BasicAuthentication("todo1", "todo1"));
		ResteasyWebTarget target = client.target("http://localhost:8280/api/v1");
		ClienteService service = target.proxy(ClienteService.class);
		Response response = service.consultarClientes();	    
	    assertEquals(HTTP_OK, response.getStatus());
	    assertEquals(APPLICATION_JSON, response.getMediaType().toString());
	    assertEquals("Hola Mundo", response.readEntity(String.class));
		response.close();
	}
}
