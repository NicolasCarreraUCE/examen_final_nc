package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Vuelo;

public interface IVueloRepo {
	Vuelo buscar(Integer id);
	List<Vuelo> buscarTodos();
	void insertar(Vuelo vuelo);
	void actualizar(Vuelo vuelo);
	void eliminar(Integer id);
	
	List<Vuelo> buscarPorOrigenDestinoFecha(String origen, String destino, LocalDateTime fechaVuelo);
}
