package com.janhelmut.avz.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.janhelmut.avz.domain.util.BaseEntity;

@Entity
public class Contact extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Version
	private int version;

	private String firstName;

	private String lastName;

	private Customer customer;

	@OneToMany
	private List<Adress> adresses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getCristianname() {
		return firstName;
	}

	public void setCristianname(String cristianname) {
		this.firstName = cristianname;
	}

	public String getSurname() {
		return lastName;
	}

	public void setSurname(String surname) {
		this.lastName = surname;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Adress> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}

}
