package com.vyjsoft.PruebaSpringBootYDrools.core;

import com.vyjsoft.PruebaSpringBootYDrools.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PruebaSpringBootYDroolsApplicationTests {


	private Customer customer = new Customer();

	@Test
	void setterYgetterNombre() {


		String nombre = "Jose G.";
		customer.setNombre("Jose G.");
		assertEquals(nombre, customer.getNombre());
	}

	@Test
	void setterYgetterApellido(){


		String apellido = "Gomez";
		customer.setApellido("Gomez");
		assertEquals(apellido, customer.getApellido());
	}

	@Test
	void setterYgetterDireccion(){
		String direccion="Paraguay 2073 5to piso 36";
		customer.setDireccion("Paraguay 2073 5to piso 36");
		assertEquals(direccion, customer.getDireccion());
	}

	@Test
	void setterYgetterDiaNacimiento(){
		String fecNac = "26 de Agosto de 1969";
		customer.setFechaNacimiento("26 de Agosto de 1969");
		assertEquals(fecNac, customer.getFechaNacimiento());
	}

	@Test
	void setterYgetterCelular(){
		String celu = "1160129797";

		customer.setTelefono("1160129797");
		assertEquals(celu, customer.getTelefono());
	}

	@Test
	void setterYgetterPais(){
		String pais = "Argentina";
		customer.setPais("Argentina");
		assertEquals(pais, customer.getPais());
	}

	@Test
	void setterYgetterCiudadCodigoPostal(){
		String ciudad = "CABA",cp="AB1121AR";
		customer.setCiudad("CABA");
		customer.setCodigoPostal("AB1121AR");
		assertEquals(ciudad, customer.getCiudad());
		assertEquals(cp, customer.getCodigoPostal());
	}
}
