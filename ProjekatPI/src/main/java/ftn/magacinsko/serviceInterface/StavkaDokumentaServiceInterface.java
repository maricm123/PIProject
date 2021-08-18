package ftn.magacinsko.serviceInterface;

import java.util.List;

import ftn.magacinsko.entityDTO.StavkaDokumentaDTO;
import ftn.magacinsko.model.StavkaDokumenta;

public interface StavkaDokumentaServiceInterface {

	public List<StavkaDokumenta> findAll();
	
	public StavkaDokumenta findOne(Integer id);
	
	public List<StavkaDokumentaDTO> save(List<StavkaDokumentaDTO> stavke, Integer idDokumenta) throws Exception;
	
	public void remove(Integer id);
	
	public StavkaDokumenta findById(Integer id);
	
	public List<StavkaDokumenta> findByPrometniDokument_id(Integer id);
	
	public List<StavkaDokumenta> findByRobaIliUsluga_sifra(Integer id);
}
