package lt.aurimas.repository;

import org.springframework.stereotype.Repository;

@Repository("genericRepository")
public interface GenericRepository {

	Object save(Object object);
	
}
