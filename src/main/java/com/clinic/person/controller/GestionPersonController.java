package com.clinic.person.controller;

import com.clinic.person.module.PersonDTO;
import com.clinic.person.service.GestionPersonRest;

import jakarta.ejb.Stateless;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

//http://localhost:8080/clinic/service/GestionPersona/gestionPersona
@Path("/GestionPersona")
@Stateless
public class GestionPersonController {
	GestionPersonRest gestionPersonRest = new GestionPersonRest();

	@PUT
	@Path("/gestionPersona")
	@Produces(MediaType.APPLICATION_JSON)

	public Boolean save(PersonDTO personDTO) {
		return gestionPersonRest.save(personDTO);
	}
	
	@POST
	@Path("/gestionPersona")
	@Produces(MediaType.APPLICATION_JSON)

	public Boolean update(PersonDTO personDTO) {
		return gestionPersonRest.save(personDTO);
	}
	
	@DELETE
	@Path("/gestionPersona")
	@Produces(MediaType.APPLICATION_JSON)

	public Boolean delete(PersonDTO personDTO) {
		return gestionPersonRest.delete(personDTO);
	}
	
	
}
