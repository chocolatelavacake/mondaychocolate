package edu.iss.laps.model;


import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the leaverecord database table.
 * 
 */
@Entity
@Table(name="leaverecord")
@NamedQuery(name="Leaverecord.findAll", query="SELECT l FROM Leaverecord l")
public class Leaverecord {
	
	public static final String SUBMITTED = "SUBMITTED";
	public static final String APPROVED = "APPROVED";
	public static final String WITHDRAWN = "WITHDRAWN";
	public static final String UPDATED = "UPDATED";
	public static final String REJECTED = "REJECTED";

	@Id
	@Column(name="id_lrd")
	private int idLrd;

	@Column(name="approvercomment_lrd")
	private String approvercommentLrd;

	@Column(name="approverid_lrd")
	private int approveridLrd;

	@Column(name="contactdetails_lrd")
	private String contactdetailsLrd;

	@Column(name="desc_lrd")
	private String descLrd;

	@Temporal(TemporalType.DATE)
	@Column(name="fromdate_lrd")
	private Date fromdateLrd;

	@Column(name="leavecategory_lrd")
	private String leavecategoryLrd;

	@Column(name="leavestatus_lrd")
	private String leavestatusLrd;

	@Column(name="numdays_lrd")
	private double numdaysLrd;

	@Column(name="overseas_lrd")
	private String overseasLrd;

	@Column(name="timeofday_lrd")
	private String timeofdayLrd;

	@Temporal(TemporalType.DATE)
	@Column(name="todate_lrd")
	private Date todateLrd;

	@Column(name="uid_lrd")
	private int uidLrd;

	@Column(name="workdsm_lrd")
	private String workdsmLrd;

	public Leaverecord() {
	}

	public int getIdLrd() {
		return this.idLrd;
	}

	public void setIdLrd(int idLrd) {
		this.idLrd = idLrd;
	}

	public String getApprovercommentLrd() {
		return this.approvercommentLrd;
	}

	public void setApprovercommentLrd(String approvercommentLrd) {
		this.approvercommentLrd = approvercommentLrd;
	}

	public int getApproveridLrd() {
		return this.approveridLrd;
	}

	public void setApproveridLrd(int approveridLrd) {
		this.approveridLrd = approveridLrd;
	}

	public String getContactdetailsLrd() {
		return this.contactdetailsLrd;
	}

	public void setContactdetailsLrd(String contactdetailsLrd) {
		this.contactdetailsLrd = contactdetailsLrd;
	}

	public String getDescLrd() {
		return this.descLrd;
	}

	public void setDescLrd(String descLrd) {
		this.descLrd = descLrd;
	}

	public Date getFromdateLrd() {
		return this.fromdateLrd;
	}

	public void setFromdateLrd(Date fromdateLrd) {
		this.fromdateLrd = fromdateLrd;
	}

	public String getLeavecategoryLrd() {
		return this.leavecategoryLrd;
	}

	public void setLeavecategoryLrd(String leavecategoryLrd) {
		this.leavecategoryLrd = leavecategoryLrd;
	}

	public String getLeavestatusLrd() {
		return this.leavestatusLrd;
	}

	public void setLeavestatusLrd(String leavestatusLrd) {
		this.leavestatusLrd = leavestatusLrd;
	}

	public double getNumdaysLrd() {
		return this.numdaysLrd;
	}

	public void setNumdaysLrd(double numdaysLrd) {
		this.numdaysLrd = numdaysLrd;
	}

	public String getOverseasLrd() {
		return this.overseasLrd;
	}

	public void setOverseasLrd(String overseasLrd) {
		this.overseasLrd = overseasLrd;
	}

	public String getTimeofdayLrd() {
		return this.timeofdayLrd;
	}

	public void setTimeofdayLrd(String timeofdayLrd) {
		this.timeofdayLrd = timeofdayLrd;
	}

	public Date getTodateLrd() {
		return this.todateLrd;
	}

	public void setTodateLrd(Date todateLrd) {
		this.todateLrd = todateLrd;
	}

	public int getUidLrd() {
		return this.uidLrd;
	}

	public void setUidLrd(int uidLrd) {
		this.uidLrd = uidLrd;
	}

	public String getWorkdsmLrd() {
		return this.workdsmLrd;
	}

	public void setWorkdsmLrd(String workdsmLrd) {
		this.workdsmLrd = workdsmLrd;
	}

}