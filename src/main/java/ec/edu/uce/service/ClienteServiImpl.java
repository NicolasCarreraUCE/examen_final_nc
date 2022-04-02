package ec.edu.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.repository.IClienteRepo;

@Service
public class ClienteServiImpl implements IClienteServi {

	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(id);
	}

	@Override
	public List<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarTodos();
	}

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.eliminar(id);
	}
}
