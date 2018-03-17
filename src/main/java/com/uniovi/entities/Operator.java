package com.uniovi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operator {
	//properties
	//has to have permissions
	//tostring with the available permissions 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(unique=true)
	private String email;
	
	private String operatorname;
	private int canRead;
	private int canWrite;
	private int canGrant;
	
	public Operator() {}
	
	/**
	 * 
	 * Constructor para la clase Operator
	 * 
	 * Permissions -> 1 if able, 0 otherwise
	 * 
	 * @param operatorname
	 * @param canRead
	 * @param canWrite
	 * @param canGrant
	 */
	public Operator(String email, String operatorname, int canRead, int canWrite,
			int canGrant) {
		super();
		this.email = email;
		this.operatorname = operatorname;
		this.canRead = canRead;
		this.canWrite = canWrite;
		this.canGrant = canGrant;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOperatorname() {
		return operatorname;
	}

	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}

	public int getCanRead() {
		return canRead;
	}

	public void setCanRead(int canRead) {
		this.canRead = canRead;
	}

	public int getCanWrite() {
		return canWrite;
	}

	public void setCanWrite(int canWrite) {
		this.canWrite = canWrite;
	}

	public int getCanGrant() {
		return canGrant;
	}

	public void setCanGrant(int canGrant) {
		this.canGrant = canGrant;
	}

	@Override
	public String toString() {
		return "Operator [operatorname=" + operatorname + ", canRead=" + canRead
				+ ", canWrite=" + canWrite + ", canGrant=" + canGrant + "]";
	}
	
	
}
