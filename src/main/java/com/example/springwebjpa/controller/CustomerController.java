package com.example.springwebjpa.controller;

import com.example.springwebjpa.model.Customer;
import com.example.springwebjpa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    @Qualifier("customerServiceImpl")
    private CustomerService customerService;

    @GetMapping
    public Iterable<Customer> findAll(){
        return this.customerService.findAll();
    }
    @PostMapping
    public Customer save (@RequestBody Customer customer) {
        return this.customerService.save(customer);
    }
}
