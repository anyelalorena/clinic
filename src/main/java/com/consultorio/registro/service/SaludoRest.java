package com.consultorio.registro.service;

import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Stateless
public class SaludoRest {

	EntityManager em;
	
	public String saludo() {
		pruebaList();
		return "Hola mundo";
	}
	
	private void pruebaList() {
		List<String> colores = List.of("Blanco", "Negro", "Azul");
		colores.forEach(System.out::println);
	}
}
