package com.clinic.person.module;

public class PersonDTO {
	private	Long	id;
	private	String	identificationNumber; 
	private	String	firstName;
	private	String	secondName;
	private	String	fistLastName;
	private	String	secondLastName; 
	private	String	phoneNumber; 
	private	PersonTypeEnum	personTypeEnum; 
	private	Long		dTypId;
	
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
	public Long getdTypId() {
		return dTypId;
	}
	public void setdTypId(Long dTypId) {
		this.dTypId = dTypId;
	}
}
