package com.luv.cafeorderapp.repository;

import com.luv.cafeorderapp.model.CoffeeItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeItemRepository extends JpaRepository<CoffeeItem, Long> {
}