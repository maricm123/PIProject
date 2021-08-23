package ftn.magacinsko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value = "{sifraMagacina}/{sifraRobeIliUsluge}/{brojPoslovneGodine}")
	public ResponseEntity<List<MagacinskaKarticaDTO>> getMagKartByRobaIliUslua(@PathVariable("sifraMagacina") Integer sifraMagacina, @PathVariable("sifraRobeIliUsluge") Integer sifraRobeIliUsluge, 
			@PathVariable("brojPoslovneGodine") Integer brojPoslovneGodine){
		
		return ResponseEntity.ok().body(magaKarticaServiceInterface.findByRobaIliUsluga_sifraAndPoslovnaGodina_brojGodineAndMagacin_sifraMagacina(sifraRobeIliUsluge, brojPoslovneGodine, sifraMagacina));
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MagacinskaKarticaDTO> getOneMagKar(@PathVariable("id") Integer id){
		return ResponseEntity.ok().body(magaKarticaServiceInterface.findOneById(id));
	}
	
	@PutMapping
	public ResponseEntity<MagacinskaKarticaDTO> nivelacija(@RequestBody MagacinskaKarticaDTO dto){
		
		return ResponseEntity.ok().body(magaKarticaServiceInterface.nivelacija(dto));
	}
	
	@GetMapping(value = "/report/{idMagacinskeKartice}")
	public ResponseEntity getReport(@PathVariable("idMagacinskeKartice") String idMagacinskeKartice){
		return magaKarticaServiceInterface.report(idMagacinskeKartice);
	}
}
