package servicio.demo.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import servicio.demo.helper.ServicioHelper;
import servicio.demo.output.Cliente;

public class ClienteImpl {

	public void registrarCliente(Cliente cliente) throws ClienteImplException {		
		if(!Optional.ofNullable(cliente).isPresent()){
			throw new ClienteImplException("B10000", "Cliente requerido.");
		}
		if(Optional.ofNullable(this.obtenerCliente(cliente.getDni())).isPresent()){
			throw new ClienteImplException("B10001", "Cliente ya registrado.");
		}
	}

	public void actualizarCliente(String dni,Cliente cliente) throws ClienteImplException {
		if(!Optional.ofNullable(cliente).isPresent()){
			throw new ClienteImplException("B10000", "Cliente requerido.");
		}
		if(!Optional.ofNullable(this.obtenerCliente(dni)).isPresent()){
			throw new ClienteImplException("B10003", "Cliente no encontrado.");
		}
	}

	public void eliminarCliente(String dni) throws ClienteImplException {		
		if(!Optional.ofNullable(this.obtenerCliente(dni)).isPresent()){
			throw new ClienteImplException("B10003", "Cliente no encontrado.");
		}
	}

	public Cliente obtenerCliente(String dni) {
		return ServicioHelper.clientes.stream().filter(c -> dni.trim().equals(c.getDni())).findAny().orElse(null);
	}
	
	public List<Cliente> listarClientes(String value) {
		return (Optional.ofNullable(value).isPresent()) ? ServicioHelper.clientes.stream()
				.filter(c -> c.getNombres().toLowerCase().contains(value.toLowerCase())
						|| c.getApellidoPaterno().toLowerCase().contains(value.toLowerCase())
						|| c.getApellidoMaterno().toLowerCase().contains(value.toLowerCase()))
				.collect(Collectors.toList()) : ServicioHelper.clientes ;
	}

}
