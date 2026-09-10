package com.luv.cafeorderapp.service;

import com.luv.cafeorderapp.model.CoffeeItem;
import com.luv.cafeorderapp.repository.CoffeeItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeItemService {

    private final CoffeeItemRepository coffeeItemRepository;

    // Constructor Injection (Spring automatically injects CoffeeItemRepository here)
    public CoffeeItemService(CoffeeItemRepository coffeeItemRepository) {
        this.coffeeItemRepository = coffeeItemRepository;
    }

    // 1. Get all coffee items from database
    public List<CoffeeItem> getAllCoffeeItems() {
        return coffeeItemRepository.findAll();
    }

    // 2. Save a new coffee item to database
    public CoffeeItem saveCoffeeItem(CoffeeItem item) {
        return coffeeItemRepository.save(item);
    }
}