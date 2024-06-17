package model.service;

import model.dto.OrderDto;

import java.util.List;

public class OrderServiceImpl implements OrderService{

    @Override
    public void addNewOrder(OrderDto orderDto) {

    }

    @Override
    public List<OrderDto> queryAllOrder() {
        return List.of();
    }

    @Override
    public OrderDto updateOrderById(Integer id) {
        return null;
    }

    @Override
    public OrderDto deleteOrderById(Integer id) {
        return null;
    }

    @Override
    public OrderDto searchOrderById(Integer id) {
        return null;
    }
}
