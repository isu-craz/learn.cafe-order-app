package com.luv.cafeorderapp.service;

import com.luv.cafeorderapp.model.Order;
import com.luv.cafeorderapp.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    // Constructor Injection: Spring provides the OrderRepository
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // 1. Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // 2. Place a new order
    public Order placeOrder(Order order) {
        return orderRepository.save(order);
    }
}