package com.example.springwebjpa.repository;

import com.example.springwebjpa.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional<Customer> findById(Long id);
    List<Customer> findByLastName(String lastName);
}
