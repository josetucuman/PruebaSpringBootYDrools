package com.vyjsoft.PruebaSpringBootYDrools.repository;

import com.vyjsoft.PruebaSpringBootYDrools.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    void grabar(Optional<Customer> customerToUpdate);
}
