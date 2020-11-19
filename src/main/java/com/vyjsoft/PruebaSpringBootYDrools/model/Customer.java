package com.vyjsoft.PruebaSpringBootYDrools.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String nombre;

    @Column(name = "surname")
    private String apellido;

    @Column(name = "direction")
    private String direccion;

    @Column(name = "birthdate")
    private String fechaNacimiento;

    @Column(name = "phone")
    private String telefono;

    @Column(name = "country")
    private String pais;

    @Column(name = "city")
    private String ciudad;

    @Column(name = "post_code")
    private String codigoPostal;
}
