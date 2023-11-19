package com.bharat.devops.order.entity;

import com.bharat.devops.order.dto.FoodItemsDTO;
import com.bharat.devops.order.dto.Restaurant;
import com.bharat.devops.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 05 February 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;
}
