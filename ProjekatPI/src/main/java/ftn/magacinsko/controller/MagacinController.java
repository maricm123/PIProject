package ftn.magacinsko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping(value = "preduzece/{id}")
	public ResponseEntity<List<MagacinDTO>> getMagaciniByPreduzece(@PathVariable("id") Integer id){
		
		return ResponseEntity.ok().body(magacinServiceInterface.findByPreduzece_id(id));
	}
	
	@PostMapping
	public ResponseEntity<MagacinDTO> addMagacin(@RequestBody MagacinDTO magacinDTO){
		
		return ResponseEntity.ok().body(magacinServiceInterface.save(magacinDTO));
	}

	@PutMapping(value = "/{id}", consumes = "application/json")
	public ResponseEntity<Void> updateMagacin(@RequestBody MagacinDTO magacinDTO, @PathVariable("id") Integer id){
		try {
			magacinServiceInterface.update(id,magacinDTO);
			return  ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteMagacin(@PathVariable("id") Integer id){
		magacinServiceInterface.remove(id);
		return  ResponseEntity.noContent().build();
	}
}