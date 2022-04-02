package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.modelo.VueloTO;

@Service
@EnableAsync
public class GestorClienteServiImlp implements IGestorClienteServi {

	@Autowired
	private IVueloServi vueloServi;
	
	@Override
	public List<VueloTO> buscarVuelosDisponibles(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		List<Vuelo> vuelos = this.vueloServi.buscarPorOrigenDestinoFecha(origen, destino, fechaVuelo);
		
		vuelos.parallelStream().filter(v -> v.getEstado().equals(Character.valueOf('D'))).map(null);
		
		
		return null;
	}

}
