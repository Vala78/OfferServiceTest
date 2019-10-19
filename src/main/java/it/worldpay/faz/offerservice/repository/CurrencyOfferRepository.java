package it.worldpay.faz.offerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.worldpay.faz.offerservice.model.CurrencyOffer;

public interface CurrencyOfferRepository extends JpaRepository<CurrencyOffer, Long>{

}
