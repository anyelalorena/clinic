package com.clinic.person.service;

import com.clinic.person.module.Person;
import com.clinic.person.module.PersonDTO;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class GestionPersonRest {
	@PersistenceContext
	EntityManager em;

	public Boolean save(PersonDTO personDTO) {
		em.persist(change(personDTO));
		return true;
	}
	
	public Person search(PersonDTO personDTO) {
		Person person = new Person();
		person= em.find(person.getClass(), personDTO.getId());
		return person;
	}
	
	public Boolean update(PersonDTO personDTO) {
		if (search(personDTO)!= null) {
			em.merge(search(personDTO));
			return true;
		}
		return false;
	}
	
	public Boolean delete(PersonDTO personDTO) {
		if (search(personDTO)!= null) {
			em.remove(search(personDTO));
			return true;
		}
		return false;
	}
	
	private Person change(PersonDTO personDTO) {
		Person person = new Person();
		person.setId(personDTO.getId());//Creo que este no va, porque se crea solo en la BD
		person.setIdentificationNumber(personDTO.getIdentificationNumber());
		person.setFirstName(personDTO.getFirstName());
		person.setSecondName(personDTO.getSecondName()); 
		person.setFistLastName(personDTO.getFistLastName());
		person.setSecondLastName(personDTO.getSecondLastName());
		person.setPhoneNumber(personDTO.getPhoneNumber());
		person.setPersonTypeEnum(personDTO.getPersonTypeEnum());
		person.setDTypId(personDTO.getdTypId());
		return person;
	}
}
