package ftn.magacinsko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.magacinsko.entityDTO.MagacinskaKarticaDTO;
import ftn.magacinsko.serviceInterface.MagacinskaKarticaServiceInterface;

@RestController
@RequestMapping(value = "api/magacinska-kartica")
public class MagacinskaKarticaController {
	
	@Autowired
	private MagacinskaKarticaServiceInterface magaKarticaServiceInterface;
	
	@GetMapping
	public ResponseEntity<List<MagacinskaKarticaDTO>> getMagacinskeKartice(){
		
		return ResponseEntity.ok().body(magaKarticaServiceInterface.findAll());
	}
}
