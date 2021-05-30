package in.simbu.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.simbu.Entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Serializable>{

}
