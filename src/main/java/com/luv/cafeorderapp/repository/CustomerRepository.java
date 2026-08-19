package com.luv.cafeorderapp.repository;

import com.luv.cafeorderapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
