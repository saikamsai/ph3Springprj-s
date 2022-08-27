package com.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	@Id
	private int id;
	private String firstname;
	private String lastname;
	private String feedback;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", feedback=" + feedback
				+ "]";
	}
	public Feedback(int id, String firstname, String lastname, String feedback) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.feedback = feedback;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
