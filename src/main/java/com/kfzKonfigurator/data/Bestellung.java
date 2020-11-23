package com.kfzKonfigurator.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Bestellung")
public class Bestellung {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int bestellungId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "autoId")
	public Auto auto;

	public Bestellung() {

	}

	public Bestellung(Auto auto) {
		this.auto = auto;
	}

}
