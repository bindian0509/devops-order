package com.bharat.devops.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 05 February 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOFromFE {
    private List<FoodItemsDTO> foodItemsList;
    private Integer userId;
    private Restaurant restaurant;
}
