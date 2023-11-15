package com.bharat.devops.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 05 February 2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemsDTO {
    private int id;
    private String itemName;
    private String itemDescription;
    private boolean isVeg;
    private Long price;
    private Integer restaurantId;
    private Integer quantity;
}
