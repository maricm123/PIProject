package ftn.magacinsko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.magacinsko.entityDTO.RobaIliUslugaDTO;
import ftn.magacinsko.serviceInterface.RobaIliUslugaServiceInterface;

@RestController
@RequestMapping(value = "api/roba-ili-usluga")
public class RobaIliUslugaController {

	@Autowired
	private RobaIliUslugaServiceInterface robaIliUslugaServiceInterface;
	
	@GetMapping
	public ResponseEntity<List<RobaIliUslugaDTO>> getRobeIliUsluge(){
		
		return ResponseEntity.ok().body(robaIliUslugaServiceInterface.findAll());
	}
}
