package com.consultorio.registro.module;

public enum PersonTypeEnum {

	/**
	 * Indicador que representa tipo persona "PACIENTE"
	 */
	PACIENTE("enum.personType.paciente"),
	
	/**
	 * Indicador que representa tipo persona "DOCTOR"
	 */
	DOCTOR("enum.personType.doctor"),
	
	/**
	 * Indicador que representa tipo persona "DOCTOR"
	 */
		ENFERMERA("enum.personType.enfermera");
	
	/**
	 * Atributo que contiene la clave del mensaje para la internacionalizacion  
	 */
	private String messageCode;

	/**
	 * Constructor que recibe como parametro el codigo del mensaje
	 * 
	 * @param codigoMensaje, Clave del mensaje para para internacionalizacion
	 */
	PersonTypeEnum(String messageCode) {		
		this.messageCode = messageCode;
	}

	/**
	 * Metodo que retorna el valor del atributo
	 * 
	 * @return cadena con el codigo del mensaje
	 */
	public String getmessageCode() {
		return messageCode;
	}

	/***
	 *
	 * Metodo encargado de retornar el enum segun su nombre
	 * @param description
	 * @return
	 */
	public static PersonTypeEnum getEnumValue(String description) {
		if (description != null) {
			for (PersonTypeEnum personTypeEnum : PersonTypeEnum.values()) {
				if (description.equalsIgnoreCase(personTypeEnum.name())) {
					return personTypeEnum;
				}
			}
		}
		return null;
	}

}
