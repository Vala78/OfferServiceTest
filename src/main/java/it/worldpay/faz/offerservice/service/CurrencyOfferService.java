package it.worldpay.faz.offerservice.service;

import java.util.List;

import it.worldpay.faz.offerservice.dto.CurrencyOfferDTO;
import it.worldpay.faz.offerservice.model.CurrencyOffer;

public interface CurrencyOfferService {
	
	public List<CurrencyOfferDTO> getAllCurrencyOffer();
	public void createCurrency(CurrencyOffer currencyOffer);
	public void updateCurrency(Long currencyOfferId);
	public void deleteCurrency(Long currencyOfferId);

}
