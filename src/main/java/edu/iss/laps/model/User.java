package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@Table(name="user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User {

	@Id
	@Column(name="uid_usr")
	private int uidUsr;

	@Column(name="designation_usr")
	private String designationUsr;

	@Column(name="email_usr")
	private String emailUsr;

	@Column(name="firstname_usr")
	private String firstnameUsr;

	@Column(name="lastname_usr")
	private String lastnameUsr;

	@Column(name="password_usr")
	private String passwordUsr;

	@Column(name="username_usr")
	private String usernameUsr;

	public User() {
	}

	public int getUidUsr() {
		return this.uidUsr;
	}

	public void setUidUsr(int uidUsr) {
		this.uidUsr = uidUsr;
	}

	public String getDesignationUsr() {
		return this.designationUsr;
	}

	public void setDesignationUsr(String designationUsr) {
		this.designationUsr = designationUsr;
	}

	public String getEmailUsr() {
		return this.emailUsr;
	}

	public void setEmailUsr(String emailUsr) {
		this.emailUsr = emailUsr;
	}

	public String getFirstnameUsr() {
		return this.firstnameUsr;
	}

	public void setFirstnameUsr(String firstnameUsr) {
		this.firstnameUsr = firstnameUsr;
	}

	public String getLastnameUsr() {
		return this.lastnameUsr;
	}

	public void setLastnameUsr(String lastnameUsr) {
		this.lastnameUsr = lastnameUsr;
	}

	public String getPasswordUsr() {
		return this.passwordUsr;
	}

	public void setPasswordUsr(String passwordUsr) {
		this.passwordUsr = passwordUsr;
	}

	public String getUsernameUsr() {
		return this.usernameUsr;
	}

	public void setUsernameUsr(String usernameUsr) {
		this.usernameUsr = usernameUsr;
	}

}