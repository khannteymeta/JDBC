package model.service;

import model.dto.OrderDto;

import java.util.List;

public interface OrderService {
    void addNewOrder(OrderDto orderDto);
    List<OrderDto> queryAllOrder();
    OrderDto updateOrderById(Integer id);
    OrderDto deleteOrderById(Integer id);
    OrderDto searchOrderById(Integer id);
}
