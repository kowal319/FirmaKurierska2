package repository;

import entity.Delivery;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
}
