package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.Avion;

public interface IAvionRepo {
	Avion buscar(Integer id);
	List<Avion> buscarTodos();
	void insertar(Avion avion);
	void actualizar(Avion avion);
	void eliminar(Integer id);
}
