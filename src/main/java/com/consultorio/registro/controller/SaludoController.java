package com.consultorio.registro.controller;

import com.consultorio.registro.service.SaludoRest;

import jakarta.ejb.Stateless;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

//http://localhost:8080/clinic/service/SaludoRest/saludo
@Path("/SaludoRest")
@Stateless
public class SaludoController {
	@ApplicationScoped
	SaludoRest soludoRest= new SaludoRest();
	
	@GET
	@Path("/saludo")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludo() {
		return soludoRest.saludo();
	}

}
