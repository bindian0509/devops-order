package com.bharat.devops.order.service;

import com.bharat.devops.order.dto.OrderDTO;
import com.bharat.devops.order.dto.OrderDTOFromFE;
import com.bharat.devops.order.dto.UserDTO;
import com.bharat.devops.order.entity.Order;
import com.bharat.devops.order.mapper.OrderMapper;
import com.bharat.devops.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 05 February 2024
 */
@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    SequenceGenerator sequenceGenerator;

    @Autowired
    RestTemplate restTemplate;

    public OrderDTO saveOrderInDb(OrderDTOFromFE orderDetails) {
        Integer newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = null; //fetchUserDetailsFromUserId(orderDetails.getUserId());
        Order orderToBeSaved = new Order(newOrderID, orderDetails.getFoodItemsList(), orderDetails.getRestaurant(), userDTO );
        orderRepo.save(orderToBeSaved);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSaved);
    }

    private UserDTO fetchUserDetailsFromUserId(Integer userId) {
        return restTemplate.getForObject("http://USER-SERVICE/user/" + userId, UserDTO.class);
    }
}