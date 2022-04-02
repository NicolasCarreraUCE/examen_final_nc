package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Avion;
import ec.edu.uce.repository.IAvionRepo;

@Service
public class AvionServiImpl implements IAvionServi {

	@Autowired
	private IAvionRepo avionRepo;
	
	@Override
	public Avion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.avionRepo.buscar(id);
	}

	@Override
	public List<Avion> buscarTodos() {
		// TODO Auto-generated method stub
		return this.avionRepo.buscarTodos();
	}

	@Override
	public void insertar(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepo.insertar(avion);
	}

	@Override
	public void actualizar(Avion avion) {
		// TODO Auto-generated method stub
		this.avionRepo.actualizar(avion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.avionRepo.eliminar(id);
	}
	
}
