package com.bvhieu.base.Repo;

import com.bvhieu.base.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Stream;

public interface OrderRepo extends JpaRepository<Order, Long> {
    Stream<Order> findByActiveTrue();

}
