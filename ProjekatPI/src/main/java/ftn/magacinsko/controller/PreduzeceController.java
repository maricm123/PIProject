package ftn.magacinsko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.magacinsko.entityDTO.PreduzeceDTO;
import ftn.magacinsko.serviceInterface.PreduzeceServiceInterface;

@RestController
@RequestMapping(value = "api/preduzece")
public class PreduzeceController {
	
	@Autowired
	private PreduzeceServiceInterface preduzeceService;
	
	@GetMapping
	public ResponseEntity<List<PreduzeceDTO>> getPreduzeca(){
		
		return ResponseEntity.ok().body(preduzeceService.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PreduzeceDTO> getPreduzece(@PathVariable("id") Integer id) throws Exception{
		
		return ResponseEntity.ok().body(preduzeceService.findById(id));
	}
}