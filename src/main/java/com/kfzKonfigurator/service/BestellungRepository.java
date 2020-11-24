package com.kfzKonfigurator.service;

import org.springframework.data.repository.CrudRepository;

import com.kfzKonfigurator.data.Bestellung;

public interface BestellungRepository extends CrudRepository<Bestellung, Integer> {

	Bestellung findById(int bestellungId);
	
}
