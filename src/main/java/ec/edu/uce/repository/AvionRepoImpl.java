package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Avion;

@Repository
@Transactional
public class AvionRepoImpl implements IAvionRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Avion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Avion.class, id);
	}

	@Override
	public List<Avion> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Avion> myQuery = this.entityManager.createQuery("SELECT e FROM Avion e", Avion.class);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(avion);
	}

	@Override
	public void actualizar(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(avion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}
}
