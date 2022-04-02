package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepoImpl implements IVueloRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Vuelo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Vuelo.class, id);
	}

	@Override
	public List<Vuelo> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery("SELECT e FROM Vuelo e", Vuelo.class);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);
	}

	@Override
	public void actualizar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	public List<Vuelo> buscarPorOrigenDestinoFecha(String origen, String destino, LocalDateTime fechaVuelo) {
		// TODO Auto-generated method stub
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery("SELECT e FROM Vuelo e WHERE e.origen=:origen AND e.destino =:destino AND e.fechaVuelo =:fechaVuelo", Vuelo.class);
		myQuery.setParameter("origen", origen);
		myQuery.setParameter("destino", destino);
		myQuery.setParameter("fechaVuelo", fechaVuelo);
		return myQuery.getResultList();
	}

}
