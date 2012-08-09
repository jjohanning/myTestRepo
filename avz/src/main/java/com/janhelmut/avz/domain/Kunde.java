package com.janhelmut.avz.domain;

import java.util.List;

public class Kunde {

	private String name;

	private List<Adresse> adressen;

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
}
