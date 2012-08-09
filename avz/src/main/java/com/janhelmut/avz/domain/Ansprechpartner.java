package com.janhelmut.avz.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Ansprechpartner {

	@Id
	private long id;

	@Version
	private int version;

	private String vorname;
	
	private String nachname;

	private Kunde kunde;

	private List<Adresse> adressen;

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

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public List<Adresse> getAdressen() {
		return adressen;
	}

	public void setAdressen(List<Adresse> adressen) {
		this.adressen = adressen;
	}

}
