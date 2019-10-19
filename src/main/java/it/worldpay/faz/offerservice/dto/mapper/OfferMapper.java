package it.worldpay.faz.offerservice.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import it.worldpay.faz.offerservice.dto.OfferDTO;
import it.worldpay.faz.offerservice.model.Offer;

public class OfferMapper {
	
	public static OfferDTO from(Offer offer) {
		
		return new OfferDTO(
				offer.getOfferId(),
				offer.getOfferCode(),
				offer.getOfferExpiringDate(), 
				offer.getOfferStartingDate(), 
				offer.getOfferDiscountPercent(), 
				offer.getOfferDescription(), 
				offer.isExpired(), 
				offer.getProductList(), 
				offer.getCurrencyOffer()
				);
	}
	
	public static Offer to(OfferDTO offer) {
		
		return new Offer(
				offer.getOfferId(),
				offer.getOfferCode(),
				offer.getOfferExpiringDate(), 
				offer.getOfferStartingDate(), 
				offer.getOfferDiscountPercent(), 
				offer.getOfferDescription(), 
				offer.isExpired(), 
				offer.getProductList(), 
				offer.getCurrencyOffer()
				);
	}

	public static List<OfferDTO> mapFrom(List<Offer> listOffer){
		return listOffer.stream().map(OfferMapper::from).collect(Collectors.toList());
	}
	
	public static List<Offer> mapTo(List<OfferDTO> listOffer){
		return listOffer.stream().map(OfferMapper::to).collect(Collectors.toList());
	}
}
