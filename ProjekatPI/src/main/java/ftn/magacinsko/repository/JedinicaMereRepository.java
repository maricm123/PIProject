package ftn.magacinsko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ftn.magacinsko.model.JedinicaMere;


public interface JedinicaMereRepository extends JpaRepository<JedinicaMere,Integer>{
	JedinicaMere findOneById(Integer id);
}
