package edu.iss.laps.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the roles database table.
 * 
 */
@Entity
@Table(name="roles")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role {

	@Id
	@Column(name="id_ros")
	private int idRos;

	@Column(name="role_ros")
	private String roleRos;

	@Column(name="uid_ros")
	private int uidRos;

	public Role() {
	}

	public int getIdRos() {
		return this.idRos;
	}

	public void setIdRos(int idRos) {
		this.idRos = idRos;
	}

	public String getRoleRos() {
		return this.roleRos;
	}

	public void setRoleRos(String roleRos) {
		this.roleRos = roleRos;
	}

	public int getUidRos() {
		return this.uidRos;
	}

	public void setUidRos(int uidRos) {
		this.uidRos = uidRos;
	}

}