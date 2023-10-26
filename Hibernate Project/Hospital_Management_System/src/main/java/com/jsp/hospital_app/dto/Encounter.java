package com.jsp.hospital_app.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String reason;
	private Date dojoin;
	private Date dodischarge;
	@OneToMany(mappedBy = "encounter")
	private List<Observation>observation;
	@JoinColumn
	@ManyToOne
	private Branch branchs;
	@OneToMany(mappedBy = "encounters")
	private List<MedOrder>medOrder;
	@JoinColumn
	@ManyToOne
	private Person person;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getDojoin() {
		return dojoin;
	}
	public void setDojoin(Date dojoin) {
		this.dojoin = dojoin;
	}
	public Date getDodischarge() {
		return dodischarge;
	}
	public void setDodischarge(Date dodischarge) {
		this.dodischarge = dodischarge;
	}
	public List<Observation> getObservation() {
		return observation;
	}
	public void setObservation(List<Observation> observation) {
		this.observation = observation;
	}
	public Branch getBranchs() {
		return branchs;
	}
	public void setBranchs(Branch branchs) {
		this.branchs = branchs;
	}
	public List<MedOrder> getMedorder() {
		return medOrder;
	}
	public void setMedorder(List<MedOrder> medOrder) {
		this.medOrder = medOrder;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
