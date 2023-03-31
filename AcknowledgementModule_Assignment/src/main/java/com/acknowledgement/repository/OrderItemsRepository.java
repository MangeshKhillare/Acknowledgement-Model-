package com.acknowledgement.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acknowledgement.entity.OrderItems;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Serializable> {

}
