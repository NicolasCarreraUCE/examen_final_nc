package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.CompraPasaje;

public interface ICompraPasajeRepo {
	CompraPasaje buscar(Integer id);
	List<CompraPasaje> buscarTodos();
	void insertar(CompraPasaje compraPasaje);
	void actualizar(CompraPasaje compraPasaje);
	void eliminar(Integer id);
}
