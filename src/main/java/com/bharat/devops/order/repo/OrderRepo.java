package com.bharat.devops.order.repo;

import com.bharat.devops.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 05 February 2024
 */
@Repository
public interface OrderRepo extends MongoRepository<Order, Integer> {
}
