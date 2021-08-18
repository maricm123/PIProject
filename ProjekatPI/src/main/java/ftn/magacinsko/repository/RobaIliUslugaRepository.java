package ftn.magacinsko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ftn.magacinsko.model.RobaIliUsluga;

public interface RobaIliUslugaRepository extends JpaRepository<RobaIliUsluga, Integer>{

	RobaIliUsluga findOneBySifra(Integer Id);
}

