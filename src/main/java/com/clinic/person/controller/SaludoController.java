package com.clinic.person.controller;

import com.clinic.person.service.SaludoRest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

//http://localhost:8080/clinic/service/Saludo/saludar
@Path("/Saludo")
public class SaludoController {
	SaludoRest saludoRest= new SaludoRest();
	@GET
	@Path("/saludar")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludar() {
		return saludoRest.saludo();
	}
}
