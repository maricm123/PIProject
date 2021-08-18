package ftn.magacinsko.serviceInterface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import ftn.magacinsko.entityDTO.PrometniDokumentDTO;
import ftn.magacinsko.model.PrometniDokument;

public interface PrometniDokumentServiceInterface {

	List<PrometniDokument> findAll();
	PrometniDokumentDTO save(PrometniDokumentDTO prometniDokument) throws Exception;
	PrometniDokument findOneById(Integer id);
	PrometniDokument findOneByRedniBroj(String redniBroj);
	String findByMaxid();
	List<PrometniDokument> findByRedniBroj(String redniBroj);
	
	public ResponseEntity report(String broj);
}
