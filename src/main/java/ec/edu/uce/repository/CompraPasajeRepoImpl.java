package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CompraPasaje;

@Repository
@Transactional
public class CompraPasajeRepoImpl implements ICompraPasajeRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public CompraPasaje buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CompraPasaje.class, id);
	}

	@Override
	public List<CompraPasaje> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<CompraPasaje> myQuery = this.entityManager.createQuery("SELECT e FROM CompraPasaje e", CompraPasaje.class);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.entityManager.merge(compraPasaje);
	}

	@Override
	public void actualizar(CompraPasaje compraPasaje) {
		// TODO Auto-generated method stub
		this.entityManager.merge(compraPasaje);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
