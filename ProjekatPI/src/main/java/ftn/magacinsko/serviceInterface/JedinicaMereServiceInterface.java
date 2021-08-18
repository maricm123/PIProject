package ftn.magacinsko.serviceInterface;

import java.util.List;
import ftn.magacinsko.entityDTO.JedinicaMereDTO;
public interface JedinicaMereServiceInterface {

	public List<JedinicaMereDTO> findAll();
	public JedinicaMereDTO findOneById(Integer id);
	public JedinicaMereDTO save(JedinicaMereDTO jedinicaMereDTO);
	public void remove(Integer idJediniceMere);
	public JedinicaMereDTO update(Integer id, JedinicaMereDTO jedinicaMereDTO);
}

