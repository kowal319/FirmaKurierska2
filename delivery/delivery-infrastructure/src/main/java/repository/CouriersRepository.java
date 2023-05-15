package repository;

import entity.Couriers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouriersRepository extends CrudRepository<Couriers, Long> {
}
