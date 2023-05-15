package repository;

import entity.Tracking;
import org.springframework.data.repository.CrudRepository;

public interface TrackingRepository extends CrudRepository<Tracking, Long> {
}
