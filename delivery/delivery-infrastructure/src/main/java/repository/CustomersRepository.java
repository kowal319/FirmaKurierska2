package repository;

import entity.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long> {
}
