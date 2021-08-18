package ftn.magacinsko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ftn.magacinsko.model.PoslovniPartner;

public interface PoslovniPartnerRepository extends JpaRepository<PoslovniPartner, Integer> {
	PoslovniPartner findOneBySifraPartnera(Integer id);
}
