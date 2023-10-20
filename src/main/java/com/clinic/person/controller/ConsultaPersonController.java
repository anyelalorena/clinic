package com.clinic.person.controller;

import java.util.List;

import com.clinic.person.module.Person;
import com.clinic.person.service.ConsultaPersonRest;

import jakarta.ejb.Stateless;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

//http://localhost:8080/clinic/service/ConsultaPersona/consultarPersona
@Path("/ConsultaPersona")
@Stateless
public class ConsultaPersonController {
	//@PersistenceContext
	//EntityManager em;
	ConsultaPersonRest consultaPersonaRest = new ConsultaPersonRest();

	@GET
	@Path("/consultarPersona")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> findAll() {
		return consultaPersonaRest.findAll();
	}
}
