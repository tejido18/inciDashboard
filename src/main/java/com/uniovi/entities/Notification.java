package com.uniovi.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Document(collection="notifications")
public class Notification {
	
	@ObjectId
	private Long id;
	
	private String description;
	private Operator operator;

	/**
	 * Default constructor  
	 */
	public Notification() {
		
	}
	
	/**
	 * Constructor for the notification class
	 * @param id
	 * @param description
	 * @param operator
	 */
	public Notification(Long id, String description, Operator operator) {
		super();
		this.id = id;
		this.description = description;
		this.operator = operator;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notification other = (Notification) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		return true;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
