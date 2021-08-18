package ftn.magacinsko.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ftn.magacinsko.model.Magacin;

public interface MagacinRepository extends JpaRepository<Magacin, Integer>{
	List<Magacin> findByPreduzece_idPreduzeca(Integer id);
	
	Magacin findOneBySifraMagacina(Integer id);
}