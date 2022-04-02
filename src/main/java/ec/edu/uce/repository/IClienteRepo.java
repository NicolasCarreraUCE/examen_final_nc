package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.Cliente;

public interface IClienteRepo {
	Cliente buscar(Integer id);
	List<Cliente> buscarTodos();
	void insertar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
}
