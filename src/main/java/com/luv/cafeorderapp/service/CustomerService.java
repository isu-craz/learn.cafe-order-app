package com.luv.cafeorderapp.service;

import com.luv.cafeorderapp.model.Customer;
import com.luv.cafeorderapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

//    Methods: getAllCustomers(), saveCustomer(Customer customer).

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }




}
