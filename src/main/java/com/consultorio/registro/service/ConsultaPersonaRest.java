package com.consultorio.registro.service;

import java.util.List;

import com.consultorio.registro.module.Person;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

//http://localhost:8080/agencia/service/ConsultaPersonaRest/consultarPersona
@Path("/ConsultaPersonaRest")
@Stateless
public class ConsultaPersonaRest {

	EntityManager em;
	
	@GET
	@Path("/consultarPersona")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> findAll() {
	    return em.createQuery("SELECT * FROM Person p ORDER BY p.idPerson", Person.class)
	            .getResultList();
	}
	
//    <datasource enabled="true" jndi-name="java:/jdbc/personas" jta="true" pool-name="personas" use-ccm="false" statistics-enabled="false">
//    <connection-url>${per.url}</connection-url>
	
}
