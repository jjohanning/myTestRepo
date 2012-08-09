package com.janhelmut.avz.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Kunde {

	@Id
	private long id;

	@Version
	private int version;

	private String name;

	private List<Adresse> adressen;

	private List<Ansprechpartner> ansprechpartner;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Adresse> getAdressen() {
		return adressen;
	}

	public void setAdressen(List<Adresse> adressen) {
		this.adressen = adressen;
	}

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

	public List<Ansprechpartner> getAnsprechpartner() {
		return ansprechpartner;
	}

	public void setAnsprechpartner(List<Ansprechpartner> ansprechpartner) {
		this.ansprechpartner = ansprechpartner;
	}
}
