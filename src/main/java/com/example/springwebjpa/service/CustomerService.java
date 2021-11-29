package com.example.springwebjpa.service;

import com.example.springwebjpa.model.Customer;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer save(Customer customer);
}
