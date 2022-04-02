package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
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
		
		List<VueloTO> vuelosDisponibles = vuelos.parallelStream().filter(v -> v.getEstado().equals(Character.valueOf('D'))).map(v -> new VueloTO(v.getNumero(), v.getOrigen(), v.getDestino(), v.getCategoria(), v.getAvion().getNombre(), v.getValorAsiento())).collect(Collectors.toList());
		
		CompletableFuture<List<VueloTO>> vuelosEconomicos = (CompletableFuture<List<VueloTO>>) this.buscarPorEstado(vuelosDisponibles, Character.valueOf('E'));
		CompletableFuture<List<VueloTO>> vuelosNegocios = (CompletableFuture<List<VueloTO>>) this.buscarPorEstado(vuelosDisponibles, Character.valueOf('N'));
		CompletableFuture<List<VueloTO>> vuelosTuristas = (CompletableFuture<List<VueloTO>>) this.buscarPorEstado(vuelosDisponibles, Character.valueOf('T'));
		
		CompletableFuture.allOf(vuelosEconomicos, vuelosNegocios, vuelosTuristas);
		
		return null;
	}
	
	@Async
	private List<VueloTO> buscarPorEstado(List<VueloTO> lista, Character estado){
		return lista.parallelStream().filter(v -> v.getCategoria().equals(estado)).collect(Collectors.toList());
	}

	@Override
	public void reservarPasajesAereo(String numeroVuelo) {
		// TODO Auto-generated method stub
		
	}

}
