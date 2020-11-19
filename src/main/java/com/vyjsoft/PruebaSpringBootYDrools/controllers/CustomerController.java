package com.vyjsoft.PruebaSpringBootYDrools.controllers;

import com.vyjsoft.PruebaSpringBootYDrools.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerController {

    public List<Customer> getCustomers();
    public Optional<Customer> getCustomerById(Long id);
    public Customer addCustomer(Customer customer);
    public String deleteCustomer(Long id);
    public String updateCustomer(Customer customerNew);
    public String test();
}
