package com.clinic.agenda.module;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


/**
 * The persistent class for the TAGE_AGENDA database table.
 * 
 * @author
 */
@Entity
@Table(name = "AGENDA")
public class Agenda implements Serializable  {

	/**
	 * Atributo de seralizacion
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Atributo que determina el Id de la tabla agenda
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "T implements Serializable _AGENDA_ID_GENERATOR", sequenceName = "SEC_AGENDA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TAGE_AGENDA_ID_GENERATOR")
	@Column(name = "AGEID")
	private Long idAgenda;

	/**
	 * Atributo que determina el numero de identificion del medico
	 */
	@Column(name = "AGEIDDOCTOR")
	private String idDoctor;

	/**
	 * Atributo que determina la fecha
	 */
	@Column(name = "AGEDATE")
	private String date;

	/**
	 * Atributo que determina la hora
	 */
	@Column(name = "AGEHOUR")
	private String hour;
	
	/**
	 * Atributo que determina esta disponible no o no ese espacio de la agenda.
	 */
	@Column(name = "AGESTATUS")
	private Boolean status;
	
	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public String getIdDoctor() {
		return idDoctor;
	}

	public void setIdDoctor(String idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idAgenda, idDoctor, date, hour, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(idAgenda, other.idAgenda) 
				&& Objects.equals(idDoctor, other.idDoctor)
				&& Objects.equals(hour, other.hour)
				&& Objects.equals(date, other.date)
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Agenda [idAgenda= " + idAgenda 
				   + ", idDoctor= " + idDoctor 
				   + ", date= " + date
				   + ", hour= " + hour 
				   + ", status= " + status + "]";
	}

}

