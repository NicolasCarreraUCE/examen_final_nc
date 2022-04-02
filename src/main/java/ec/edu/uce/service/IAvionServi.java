package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Avion;

public interface IAvionServi {
	Avion buscar(Integer id);
	List<Avion> buscarTodos();
	void insertar(Avion avion);
	void actualizar(Avion avion);
	void eliminar(Integer id);
}
