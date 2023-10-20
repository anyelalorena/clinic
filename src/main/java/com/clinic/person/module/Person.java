package com.clinic.person.module;

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
 * The persistent class for the PERSON database table.
 * @author
 */
@Entity
@Table(name = "PERSONA")
public class Person implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "T implements Serializable _PERSON_ID_GENERATOR", sequenceName = "SEC_PERSON")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPER_PERSON_ID_GENERATOR")
	@Column(name = "PERID")
	private Long id;

	@Column(name = "PERIDENTIFICATIONNUMBER")
	private String identificationNumber;
	
	@Column(name = "PERFIRSTNAME")
	private String firstName;
	
	@Column(name = "PERSECONDNAME")
	private String secondName;
	
	@Column(name = "PERFIRSTLASTNAME")
	private String fistLastName;
	
	@Column(name = "PERSECONDLASTNAME")
	private String secondLastName;
	
	@Column(name = "PERPHONENUMBER")
	private String phoneNumber;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "PERPERSONTYPEENUM")
	private PersonTypeEnum personTypeEnum;
	
	@Column(name = "PERDTYPID")
	private Long dTypId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public Long getDTypId() {
		return dTypId;
	}

	public void setDTypId(Long dTypId) {
		this.dTypId = dTypId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, identificationNumber, firstName, secondName, fistLastName, secondLastName,phoneNumber, personTypeEnum, dTypId);
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
		return Objects.equals(id, other.id)
				&& Objects.equals(identificationNumber, other.identificationNumber)
				&& Objects.equals(firstName, other.firstName)
				&& Objects.equals(secondName, other.secondName)
				&& Objects.equals(fistLastName, other.fistLastName)
				&& Objects.equals(secondLastName, other.secondLastName) 
				&& Objects.equals(phoneNumber, other.phoneNumber) 
				&& Objects.equals(personTypeEnum, other.personTypeEnum)
				&& Objects.equals(dTypId, other.dTypId);
	}

	@Override
	public String toString() {
		return "Persona [id= " + id + 
					  ", identificationNumber= " + identificationNumber + 
					  ", firstName= " + firstName + 
					  ", secondName=" + secondName + 
					  ", fistLastName=" + fistLastName + 
					  ", secondLastName=" + secondLastName + 
					  ", phoneNumber=" + phoneNumber + 
					  ", personTypeEnum=" + personTypeEnum + 
					  ", dTypId="+ dTypId +"]";
	}
}
