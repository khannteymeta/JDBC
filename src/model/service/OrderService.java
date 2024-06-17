package model.service;

import model.dto.OrderDto;

import java.util.List;

public interface OrderService {
    void addNewOrder(OrderDto orderDto);
    List<OrderDto> queryAllOrder(OrderDto orderDto);
    OrderDto updateOrder(OrderDto orderDto);
    OrderDto deleteOrder(OrderDto orderDto);
    OrderDto searchOrder(OrderDto orderDto);
}
