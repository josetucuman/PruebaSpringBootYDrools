package com.vyjsoft.PruebaSpringBootYDrools.service;

import com.vyjsoft.PruebaSpringBootYDrools.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> traerTodos();

    Optional<Customer> buscarClientePorID(Long idCliente);

    Customer grabarCliente(Customer customerNew);

    String borrarCliente(Long idCliente);

    String actualizarCliente(Customer customerNew);
}
