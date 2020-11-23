package com.kfzKonfigurator.service;

import org.springframework.data.repository.CrudRepository;

import com.kfzKonfigurator.data.Bestellung;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BestellungRepository extends CrudRepository<Bestellung, Integer> {

	Bestellung findById(int bestellungId);
	
}
