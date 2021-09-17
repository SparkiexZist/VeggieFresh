package th.ac.ku.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.restaurant.model.VegOrder;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<VegOrder, UUID>
{

}
