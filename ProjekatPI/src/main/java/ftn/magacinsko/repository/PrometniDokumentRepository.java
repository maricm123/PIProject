package ftn.magacinsko.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ftn.magacinsko.model.PrometniDokument;
import ftn.magacinsko.model.VrstaDokumenta;

public interface PrometniDokumentRepository extends JpaRepository<PrometniDokument, Integer> {
	List<PrometniDokument> findByVrstaDokumenta(VrstaDokumenta vrstaDokumenta);

	PrometniDokument findOneById(Integer Id); 
	
	PrometniDokument findOneByRedniBroj(String redniBroj); 
 
	@Query("SELECT max(id) FROM PrometniDokument")
	Integer najveciID();
	
	List<PrometniDokument> findByRedniBroj(String redniBroj); 
}

