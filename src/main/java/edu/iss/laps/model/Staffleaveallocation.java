package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the staffleaveallocation database table.
 * 
 */
@Entity
@Table(name="staffleaveallocation")
@NamedQuery(name="Staffleaveallocation.findAll", query="SELECT s FROM Staffleaveallocation s")
public class Staffleaveallocation {

	@Id
	@Column(name="id_sla")
	private int idSla;

	@Column(name="leavecategory_sla")
	private String leavecategorySla;

	@Column(name="numdays_sla")
	private double numdaysSla;

	@Column(name="uid_sla")
	private int uidSla;

	@Temporal(TemporalType.DATE)
	@Column(name="year_sla")
	private Date yearSla;

	public Staffleaveallocation() {
	}

	public int getIdSla() {
		return this.idSla;
	}

	public void setIdSla(int idSla) {
		this.idSla = idSla;
	}

	public String getLeavecategorySla() {
		return this.leavecategorySla;
	}

	public void setLeavecategorySla(String leavecategorySla) {
		this.leavecategorySla = leavecategorySla;
	}

	public double getNumdaysSla() {
		return this.numdaysSla;
	}

	public void setNumdaysSla(double numdaysSla) {
		this.numdaysSla = numdaysSla;
	}

	public int getUidSla() {
		return this.uidSla;
	}

	public void setUidSla(int uidSla) {
		this.uidSla = uidSla;
	}

	public Date getYearSla() {
		return this.yearSla;
	}

	public void setYearSla(Date yearSla) {
		this.yearSla = yearSla;
	}

}