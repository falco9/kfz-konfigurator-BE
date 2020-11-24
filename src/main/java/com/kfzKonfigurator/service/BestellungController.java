package com.kfzKonfigurator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kfzKonfigurator.data.Auto;
import com.kfzKonfigurator.data.Bestellung;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/bestellung")
public class BestellungController {

	@Autowired
	private BestellungRepository bestellungRepository;

	// Post Request um eine Bestellung und das zugehörige AutoObjekt der
	// Datenbank hinzuzufügen
	
	@PostMapping(path = "/add",  consumes = "application/json")
	public @ResponseBody Bestellung newAuto(@RequestBody Auto newAuto) {

		// Das Auto Objekt wird mit den Parametereingaben erstellt und dem
		// Bestellungsobjekt hinzugefügt und in den DB Tabellen gespeichert
		Bestellung bestellung = new Bestellung(newAuto);
		bestellungRepository.save(bestellung);
		return bestellung;
		
	}

	// Get Request fragt eine Bestellung anhand der generierten ID ab
	@GetMapping(path = "/bestellungId")
	public @ResponseBody Bestellung bestellungId(@RequestParam int bestellungId) {
		return bestellungRepository.findById(bestellungId);
	}
	
}
