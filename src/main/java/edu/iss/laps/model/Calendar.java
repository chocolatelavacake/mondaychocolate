package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the calendar database table.
 * 
 */
@Entity
@Table(name="calendar")
@NamedQuery(name="Calendar.findAll", query="SELECT c FROM Calendar c")
public class Calendar {

	@Id
	@Column(name="id_clr")
	private int idClr;

	@Temporal(TemporalType.DATE)
	@Column(name="date_clr")
	private Date dateClr;

	@Column(name="desc_clr")
	private String descClr;

	@Column(name="name_clr")
	private String nameClr;

	public Calendar() {
	}

	public int getIdClr() {
		return this.idClr;
	}

	public void setIdClr(int idClr) {
		this.idClr = idClr;
	}

	public Date getDateClr() {
		return this.dateClr;
	}

	public void setDateClr(Date dateClr) {
		this.dateClr = dateClr;
	}

	public String getDescClr() {
		return this.descClr;
	}

	public void setDescClr(String descClr) {
		this.descClr = descClr;
	}

	public String getNameClr() {
		return this.nameClr;
	}

	public void setNameClr(String nameClr) {
		this.nameClr = nameClr;
	}

}