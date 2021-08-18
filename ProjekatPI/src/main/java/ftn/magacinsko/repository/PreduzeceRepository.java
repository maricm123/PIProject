package ftn.magacinsko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import ftn.magacinsko.model.Preduzece;

public interface PreduzeceRepository extends JpaRepository<Preduzece, Integer> {
	
	Preduzece findOneByIdPreduzeca(Integer preduzeceId);
}