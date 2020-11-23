package com.kfzKonfigurator.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Auto")
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int autoId;
	public String motorleistung;
	public String lackierung;
	public String felgen;
	public boolean klimaanlage;
	public boolean soundanlage;
	public boolean sitzheizung;
	public int preis;

	@OneToOne(mappedBy = "auto", cascade = CascadeType.ALL)
	private Bestellung bestellung;

	public Auto() {

	}

	public Auto(String motorleistung, String lackierung, String felgen, boolean klimaanlage, boolean soundanlage,
			boolean sitzheizung, int preis) {
		this.motorleistung = motorleistung;
		this.lackierung = lackierung;
		this.felgen = felgen;
		this.klimaanlage = klimaanlage;
		this.soundanlage = soundanlage;
		this.sitzheizung = sitzheizung;
		this.preis = preis;
	}

}
