package ftn.magacinsko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.magacinsko.entityDTO.MagacinDTO;
import ftn.magacinsko.serviceInterface.MagacinServiceInterface;
import ftn.magacinsko.serviceInterface.PreduzeceServiceInterface;

@RestController
@RequestMapping(value = "api/magacin")
public class MagacinController {
	
	@Autowired
	MagacinServiceInterface magacinServiceInterface;
	
	@Autowired
	PreduzeceServiceInterface preduzeceServiceInterface;
	
	@GetMapping
	public ResponseEntity<List<MagacinDTO>> getMagacin(){
		
		return ResponseEntity.ok().body(magacinServiceInterface.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<MagacinDTO> getMagacin(@PathVariable("id") Integer id){
		
		return ResponseEntity.ok().body(magacinServiceInterface.findOne(id));
	}
}