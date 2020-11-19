package com.vyjsoft.PruebaSpringBootYDrools.controllers.impl;

import com.vyjsoft.PruebaSpringBootYDrools.controllers.CustomerController;
import com.vyjsoft.PruebaSpringBootYDrools.model.Customer;
import com.vyjsoft.PruebaSpringBootYDrools.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    CustomerService service;

    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<Customer> getCustomers() {
        return service.traerTodos();
    }

    @Override
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = "application/json")
    public Optional<Customer> getCustomerById(Long id) {
        return service.buscarClientePorID(id);
    }

    @Override
    @RequestMapping(value = "/customers/add", method = RequestMethod.POST, produces = "application/json")
    public Customer addCustomer(Customer customer) {
        return service.grabarCliente(customer);
    }

    @Override
    @RequestMapping(value = "/customers/delete/{id}", method = RequestMethod.GET, produces = "application/json")
    public String deleteCustomer(Long id) {
        return service.borrarCliente(id);
    }

    @Override
    @RequestMapping(value = "/customers/update", method = RequestMethod.PATCH, produces = "application/json")
    public String updateCustomer(Customer customerNew) {
        return service.actualizarCliente(customerNew);
    }

    @Override
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public String test() {
        return "test OK";
    }
}
