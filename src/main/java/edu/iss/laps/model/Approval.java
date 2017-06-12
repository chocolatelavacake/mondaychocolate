package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the approval database table.
 * 
 */
@Entity
@Table(name="approval")
@NamedQuery(name="Approval.findAll", query="SELECT a FROM Approval a")
public class Approval {

	@Id
	@Column(name="id_apl")
	private int idApl;

	@Column(name="approverid_apl")
	private int approveridApl;

	@Column(name="uid_apl")
	private int uidApl;

	public Approval() {
	}

	public int getIdApl() {
		return this.idApl;
	}

	public void setIdApl(int idApl) {
		this.idApl = idApl;
	}

	public int getApproveridApl() {
		return this.approveridApl;
	}

	public void setApproveridApl(int approveridApl) {
		this.approveridApl = approveridApl;
	}

	public int getUidApl() {
		return this.uidApl;
	}

	public void setUidApl(int uidApl) {
		this.uidApl = uidApl;
	}

}