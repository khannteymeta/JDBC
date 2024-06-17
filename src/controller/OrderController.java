package controller;

import model.dto.OrderDto;
import model.service.OrderService;
import model.service.OrderServiceImpl;

import java.util.List;

public class OrderController {
    OrderService orderService = new OrderServiceImpl();

    public void addNewOrder(OrderDto orderDto){
        orderService.addNewOrder(orderDto);
    }

    public List<OrderDto> queryAllOrders(){
        return orderService.queryAllOrder();
    }

    public  OrderDto  updateOrderById(Integer id){
        return orderService.updateOrderById(id);
    }

    public OrderDto deleteOrderById(Integer id){
        return orderService.deleteOrderById(id);
    }

    public  OrderDto searchOrderById(Integer id){
        return  orderService.searchOrderById(id);
    }
}
