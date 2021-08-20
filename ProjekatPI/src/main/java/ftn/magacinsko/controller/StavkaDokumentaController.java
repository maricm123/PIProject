package ftn.magacinsko.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ftn.magacinsko.entityDTO.StavkaDokumentaDTO;
import ftn.magacinsko.model.StavkaDokumenta;
import ftn.magacinsko.serviceInterface.StavkaDokumentaServiceInterface;

@RestController
@RequestMapping(value = "api/stavka-dokumenta")
public class StavkaDokumentaController {

	@Autowired
	private StavkaDokumentaServiceInterface stavkaDokumentaServiceInterface;
	
	@GetMapping
	public ResponseEntity<List<StavkaDokumentaDTO>> getStavkeDokumenta(){
		List<StavkaDokumenta> stavkaDokumentas = stavkaDokumentaServiceInterface.findAll();
		
		List<StavkaDokumentaDTO> stavkaDokumentaDTO = new ArrayList<StavkaDokumentaDTO>();
		for(StavkaDokumenta std: stavkaDokumentas) {
			stavkaDokumentaDTO.add(new StavkaDokumentaDTO(std));
		}
		return new ResponseEntity<List<StavkaDokumentaDTO>>(stavkaDokumentaDTO, HttpStatus.OK);
	}
}
