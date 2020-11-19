package com.vyjsoft.PruebaSpringBootYDrools.service.impl;

import com.vyjsoft.PruebaSpringBootYDrools.model.Customer;
import com.vyjsoft.PruebaSpringBootYDrools.repository.CustomerRepository;
import com.vyjsoft.PruebaSpringBootYDrools.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public List<Customer> traerTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Customer> buscarClientePorID(Long idCliente) {

        Optional<Customer> cliente = repository.findById(idCliente);
        return cliente;
    }

    @Override
    public Customer grabarCliente(Customer customerNew) {
        if(customerNew != null){
            return repository.save(customerNew);
        }
        return new Customer();
    }

    @Override
    public String borrarCliente(Long idCliente) {

        if(repository.findById(idCliente).isPresent()){
            repository.deleteById(idCliente);
            return "Cliente borrado exitosamente!";
        }

        return "Error el cliente NO EXISTE!!!";
    }

    @Override
    public String actualizarCliente(Customer customerUpdated) {

        Long num = customerUpdated.getId();

        if(repository.findById(num).isPresent()){
            Customer clienteAActualizar = new Customer();
            clienteAActualizar.setId(customerUpdated.getId());
            clienteAActualizar.setNombre(customerUpdated.getNombre());
            clienteAActualizar.setApellido(customerUpdated.getApellido());
            clienteAActualizar.setCiudad(customerUpdated.getCiudad());
            clienteAActualizar.setDireccion(customerUpdated.getDireccion());
            clienteAActualizar.setTelefono(customerUpdated.getTelefono());
            clienteAActualizar.setPais(customerUpdated.getPais());
            clienteAActualizar.setFechaNacimiento(customerUpdated.getFechaNacimiento());
            clienteAActualizar.setCodigoPostal(customerUpdated.getCodigoPostal());
            repository.save(clienteAActualizar);
            return "Cliente actualizado";
        }
        return "Error al actualizar el cliente!!!";
    }
}
