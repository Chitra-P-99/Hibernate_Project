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
public class MedOrder {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mid;
	private String dname;
	private Date orderdate;
	private long total;
	@OneToMany(mappedBy = "medOrder")
	private List<Item>item;
	@JoinColumn
	@ManyToOne
	private Encounter encounters;
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	public Encounter getEncounters() {
		return encounters;
	}
	public void setEncounters(Encounter encounters) {
		this.encounters = encounters;
	}
}
