package com.br.fiap.javaplat.exercise.controller.Vaadin;

import java.util.List;

import com.br.fiap.javaplat.exercise.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);
    
}