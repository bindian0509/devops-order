package com.bharat.devops.order.mapper;

import com.bharat.devops.order.dto.OrderDTO;
import com.bharat.devops.order.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Monday, 05 February 2024
 */
@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}
