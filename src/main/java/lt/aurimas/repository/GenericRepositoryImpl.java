package lt.aurimas.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("genericRepository")
@Transactional
public class GenericRepositoryImpl implements GenericRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Object save(Object object) {
		entityManager.persist(object);
		return object;
	}

}
