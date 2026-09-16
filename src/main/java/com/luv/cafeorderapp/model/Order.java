package com.luv.cafeorderapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate orderDate;

    // Relationship 1: Many orders can belong to ONE Customer
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // Relationship 2: Many orders can be for ONE CoffeeItem
    @ManyToOne
    @JoinColumn(name = "coffee_id", nullable = false)
    private CoffeeItem coffeeItem;

    // 1. Default constructor (sets the order date automatically to today)
    public Order() {
        this.orderDate = LocalDate.now();
    }

    // 2. Parameterized constructor
    public Order(Customer customer, CoffeeItem coffeeItem) {
        this.customer = customer;
        this.coffeeItem = coffeeItem;
        this.orderDate = LocalDate.now();
    }

    // 3. Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CoffeeItem getCoffeeItem() {
        return coffeeItem;
    }

    public void setCoffeeItem(CoffeeItem coffeeItem) {
        this.coffeeItem = coffeeItem;
    }
}