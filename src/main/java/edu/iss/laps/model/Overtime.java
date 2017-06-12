package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the overtime database table.
 * 
 */
@Entity
@Table(name="overtime")
@NamedQuery(name="Overtime.findAll", query="SELECT o FROM Overtime o")
public class Overtime {

	@Id
	@Column(name="id_ote")
	private int idOte;

	@Column(name="approvercomment_ote")
	private String approvercommentOte;

	@Column(name="approverid_ote")
	private int approveridOte;

	@Temporal(TemporalType.DATE)
	@Column(name="date_ote")
	private Date dateOte;

	@Column(name="desc_ote")
	private String descOte;

	@Column(name="fromtime_ote")
	private Time fromtimeOte;

	@Column(name="numhours_ote")
	private double numhoursOte;

	@Column(name="overtimestatus_ote")
	private String overtimestatusOte;

	@Column(name="projectname_ote")
	private String projectnameOte;

	@Column(name="totime_ote")
	private Time totimeOte;

	@Column(name="uid_ote")
	private int uidOte;

	public Overtime() {
	}

	public int getIdOte() {
		return this.idOte;
	}

	public void setIdOte(int idOte) {
		this.idOte = idOte;
	}

	public String getApprovercommentOte() {
		return this.approvercommentOte;
	}

	public void setApprovercommentOte(String approvercommentOte) {
		this.approvercommentOte = approvercommentOte;
	}

	public int getApproveridOte() {
		return this.approveridOte;
	}

	public void setApproveridOte(int approveridOte) {
		this.approveridOte = approveridOte;
	}

	public Date getDateOte() {
		return this.dateOte;
	}

	public void setDateOte(Date dateOte) {
		this.dateOte = dateOte;
	}

	public String getDescOte() {
		return this.descOte;
	}

	public void setDescOte(String descOte) {
		this.descOte = descOte;
	}

	public Time getFromtimeOte() {
		return this.fromtimeOte;
	}

	public void setFromtimeOte(Time fromtimeOte) {
		this.fromtimeOte = fromtimeOte;
	}

	public double getNumhoursOte() {
		return this.numhoursOte;
	}

	public void setNumhoursOte(double numhoursOte) {
		this.numhoursOte = numhoursOte;
	}

	public String getOvertimestatusOte() {
		return this.overtimestatusOte;
	}

	public void setOvertimestatusOte(String overtimestatusOte) {
		this.overtimestatusOte = overtimestatusOte;
	}

	public String getProjectnameOte() {
		return this.projectnameOte;
	}

	public void setProjectnameOte(String projectnameOte) {
		this.projectnameOte = projectnameOte;
	}

	public Time getTotimeOte() {
		return this.totimeOte;
	}

	public void setTotimeOte(Time totimeOte) {
		this.totimeOte = totimeOte;
	}

	public int getUidOte() {
		return this.uidOte;
	}

	public void setUidOte(int uidOte) {
		this.uidOte = uidOte;
	}

}