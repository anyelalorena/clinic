package com.clinic.person.service;

import java.util.List;

import com.clinic.person.module.Person;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class ConsultaPersonRest {
	@PersistenceContext
	EntityManager em;

	public List<Person> findAll() {
		return em.createQuery("SELECT * FROM Person p ORDER BY p.perid", Person.class).getResultList();
	}
}
