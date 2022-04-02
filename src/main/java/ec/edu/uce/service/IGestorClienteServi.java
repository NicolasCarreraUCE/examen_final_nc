package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.VueloTO;

public interface IGestorClienteServi {
	List<VueloTO> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo);
	void reservarPasajesAereo(String numeroVuelo);
}
