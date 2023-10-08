package com.consultorio.registro.module;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


/**
 * The persistent class for the TPER_PERSONA database table.
 * 
 * @author
 */
@Entity
@Table(name = "PERSON")
public class Person implements Serializable  {

	/**
	 * Atributo de seralizacion
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo que determina el Id de la tabla
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "T implements Serializable _PERSON_ID_GENERATOR", sequenceName = "SEC_PERSON")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_PERSON_ID_GENERATOR")
	@Column(name = "PERID")
	private Long idPerson;

	/**
	 * Atributo que determina el numero de identificacion
	 */
	@Column(name = "PERIDENTIFICATIONNUMBER")
	private String identificationNumber;
	
	/**
	 * Atributo que determina el primer nombre
	 */
	@Column(name = "PERFIRSTNAME")
	private String firstName;

	/**
	 * Atributo que determina el segundo nombre
	 */
	@Column(name = "PERSECONDNAME")
	private String secondName;

	/**
	 * Atributo que determina el primer apellido
	 */
	@Column(name = "PERFIRSTLASTNAME")
	private String fistLastName;

	/**
	 * Atributo que determina el segundo apellido
	 */
	@Column(name = "PERSECONDLASTNAME")
	private String secondLastName;
	
	/**
	 * Atributo que determina el número de celular
	 */
	@Column(name = "PERPHONENUMBER")
	private String phoneNumber;
	
	/**
	 * Atributo que determina el tipo de persona
	 */
	@Enumerated(value = EnumType.STRING)
	@Column(name = "PERPERSONTYPE")
	private PersonTypeEnum personTypeEnum;

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFistLastName() {
		return fistLastName;
	}

	public void setFistLastName(String fistLastName) {
		this.fistLastName = fistLastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public PersonTypeEnum getPersonTypeEnum() {
		return personTypeEnum;
	}

	public void setPersonTypeEnum(PersonTypeEnum personTypeEnum) {
		this.personTypeEnum = personTypeEnum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPerson, identificationNumber, firstName, secondName, fistLastName, secondLastName,phoneNumber, personTypeEnum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(idPerson, other.idPerson)
				&& Objects.equals(identificationNumber, other.identificationNumber)
				&& Objects.equals(firstName, other.firstName)
				&& Objects.equals(secondName, other.secondName)
				&& Objects.equals(fistLastName, other.fistLastName)
				&& Objects.equals(secondLastName, other.secondLastName) 
				&& Objects.equals(phoneNumber, other.phoneNumber) 
				&& personTypeEnum == other.personTypeEnum;
	}

	@Override
	public String toString() {
		return "Persona [idPerson= " + idPerson + 
					  ", identificationNumber= " + identificationNumber + 
					  ", firstName= " + firstName + 
					  ", secondName=" + secondName + 
					  ", fistLastName=" + fistLastName + 
					  ", secondLastName=" + secondLastName + 
					  ", phoneNumber=" + phoneNumber + 
					  ", tipoPersonaEnum=" + personTypeEnum + "]";
	}
}
