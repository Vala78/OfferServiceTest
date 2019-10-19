package it.worldpay.faz.offerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.worldpay.faz.offerservice.model.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long>{
	
	
	@Query(value = "SELECT * FROM OFFER WHERE LOWER(OFFER_SERIAL_NO) = ?1", nativeQuery = true)
	public Offer findByOfferCode(String offerDescription);

}
