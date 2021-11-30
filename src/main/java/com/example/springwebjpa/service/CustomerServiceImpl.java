package com.example.springwebjpa.service;

import com.example.springwebjpa.model.Customer;
import com.example.springwebjpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Customer> findById(Long id) {
        return this.customerRepository.findById(id);
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        return this.customerRepository.findByLastName(lastName);
    }
}