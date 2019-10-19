package it.worldpay.faz.offerservice.service;

import java.util.List;

import it.worldpay.faz.offerservice.dto.OfferDTO;
import it.worldpay.faz.offerservice.model.Product;

public interface OfferService {
	
	public List<OfferDTO> getAllOffers() throws Exception;
	public OfferDTO getOfferById(Long offerId) throws Exception;
	public void createOffer(OfferDTO offerDTO) throws Exception;
	public void updateOffer(OfferDTO offerDTO) throws Exception;
	public void deleteOffer(OfferDTO offerDTO);
	public void addProductsToOffer(List<Product> listProducts);

}
