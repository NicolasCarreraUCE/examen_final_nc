package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Cliente;

public interface IClienteServi {
	Cliente buscar(Integer id);
	List<Cliente> buscarTodos();
	void insertar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
}
