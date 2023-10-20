package com.clinic.person.service;

import jakarta.ejb.Stateless;


@Stateless
public class SaludoRest {
	
	public String saludo() {
		return "Hola mundo";
	}
}
