package servicio.demo.helper;

import java.util.ArrayList;
import java.util.List;

import servicio.demo.output.Cliente;

public class ServicioHelper {


    private ServicioHelper() {
        super();
    }

	public static List<Cliente> clientes  = new ArrayList<Cliente>(){
    	private static final long serialVersionUID = 1L;
    	{
    		add(new Cliente("46180840","Cesar A.", "Quevedo", "Vega", "11111111111", "Av. Guardia Civil 618", "987747048"));
    		add(new Cliente("46180841","Joey B.", "Melendez", "Panana", "11111111112", "Av. Navarrete 1072", "966748072"));
    		add(new Cliente("46180842","Ivan C.", "Caballero", "Comajambo", "11111111113", "Av. la Marina 5621", "955741043"));
    		add(new Cliente("46180843","Yojan D.", "Pinto", "Vela", "11111111114", "Av. Javier Prado 1233", "954742084"));
    		add(new Cliente("46180844","Christian E.", "Altamirano", "Ayala", "11111111115", "Calle Palmeras 123", "933749095"));
    	}
    };    
    

}
