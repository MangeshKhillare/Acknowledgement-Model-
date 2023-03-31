package com.acknowledgement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acknowledgement.entity.OrderItems;

@Repository
public interface OrderIteamsRepository extends JpaRepository<OrderItems, Long> {

}
