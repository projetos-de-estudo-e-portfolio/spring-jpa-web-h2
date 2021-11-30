package com.example.springwebjpa.service;

import com.example.springwebjpa.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAll();
    Customer save(Customer customer);
    Optional<Customer> findById(Long id);
}
