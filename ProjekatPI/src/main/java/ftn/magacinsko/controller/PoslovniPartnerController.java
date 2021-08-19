package ftn.magacinsko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.magacinsko.entityDTO.PoslovniPartnerDTO;
import ftn.magacinsko.serviceInterface.PoslovniPartnerServiceInterface;

@RestController
@RequestMapping(value = "api/poslovni-partner")
public class PoslovniPartnerController {

	@Autowired
	private PoslovniPartnerServiceInterface poslovniPartnerServiceInterface;
	
	@GetMapping
	public ResponseEntity<List<PoslovniPartnerDTO>> getAll(){
		
		return ResponseEntity.ok().body(poslovniPartnerServiceInterface.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PoslovniPartnerDTO> getPoslovniPartner(@PathVariable("id") Integer id){
		
		return ResponseEntity.ok().body(poslovniPartnerServiceInterface.findOneBySifraPartnera(id));
	}
}