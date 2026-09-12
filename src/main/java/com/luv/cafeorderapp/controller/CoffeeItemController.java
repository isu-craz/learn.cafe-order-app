package com.luv.cafeorderapp.controller;

import com.luv.cafeorderapp.model.CoffeeItem;
import com.luv.cafeorderapp.service.CoffeeItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/coffees")
public class CoffeeItemController {

    private final CoffeeItemService coffeeItemService;

    // Constructor Injection: Spring injects CoffeeItemService here
    public CoffeeItemController(CoffeeItemService coffeeItemService) {
        this.coffeeItemService = coffeeItemService;
    }

    // 1. READ all coffees: GET http://localhost:8080/api/coffees
    @GetMapping
    public List<CoffeeItem> getAllCoffees() {
        return coffeeItemService.getAllCoffeeItems();
    }

    // 2. CREATE a coffee: POST http://localhost:8080/api/coffees
    @PostMapping
    public CoffeeItem createCoffee(@RequestBody CoffeeItem item) {
        return coffeeItemService.saveCoffeeItem(item);
    }
}