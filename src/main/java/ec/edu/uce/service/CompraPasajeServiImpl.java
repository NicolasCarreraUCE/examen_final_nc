package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CompraPasaje;
import ec.edu.uce.repository.ICompraPasajeRepo;

@Service
public class CompraPasajeServiImpl implements ICompraPasajeServi{

	@Autowired
	private ICompraPasajeRepo compraPasajeRepo;

	@Override
	public CompraPasaje buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.compraPasajeRepo.buscar(id);
	}

	@Override
	public List<CompraPasaje> buscarTodos() {
		// TODO Auto-generated method stub
		return this.compraPasajeRepo.buscarTodos();
	}

	@Override
	public void insertar(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.insertar(compraPasaje);
	}

	@Override
	public void actualizar(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.actualizar(compraPasaje);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.compraPasajeRepo.eliminar(id);
	}
}
