package com.example.springwebjpa.service;

import com.example.springwebjpa.model.Customer;
import com.example.springwebjpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll(){
        return this.customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepository.save(customer);
    }
}