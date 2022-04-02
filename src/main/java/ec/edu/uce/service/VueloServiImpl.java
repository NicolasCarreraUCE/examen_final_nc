package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.repository.IVueloRepo;

@Service
public class VueloServiImpl implements IVueloServi {

	@Autowired
	private IVueloRepo vueloRepo;

	@Override
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscar(id);
	}

	@Override
	public List<Vuelo> buscarTodos() {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarTodos();
	}

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepo.insertar(vuelo);
	}

	@Override
	public void actualizar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.vueloRepo.actualizar(vuelo);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.vueloRepo.eliminar(id);
	}

	@Override
	@Async
	public List<Vuelo> buscarPorOrigenDestinoFecha(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		return this.vueloRepo.buscarPorOrigenDestinoFecha(origen, destino, fechaVuelo);
	}
}
