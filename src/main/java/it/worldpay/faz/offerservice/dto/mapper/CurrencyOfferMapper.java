package it.worldpay.faz.offerservice.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import it.worldpay.faz.offerservice.dto.CurrencyOfferDTO;
import it.worldpay.faz.offerservice.model.CurrencyOffer;

public class CurrencyOfferMapper {
	
	public static CurrencyOfferDTO from(CurrencyOffer currencyOffer) {
		
		return new CurrencyOfferDTO(
				currencyOffer.getCurrencyId(),
				currencyOffer.getCurrencyDescription()
				);
	}
	
	public static CurrencyOffer to(CurrencyOfferDTO currencyOffer) {
		
		return new CurrencyOffer(
				currencyOffer.getCurrencyId(),
				currencyOffer.getCurrencyDescription()
				);
	}
	
	public static List<CurrencyOfferDTO> mapFrom(List<CurrencyOffer> listCurrencyOffer){
		return listCurrencyOffer.stream().map(CurrencyOfferMapper::from).collect(Collectors.toList());
	}
	
	public static List<CurrencyOffer> mapTo(List<CurrencyOfferDTO> listCurrencyOffer){
		return listCurrencyOffer.stream().map(CurrencyOfferMapper::to).collect(Collectors.toList());
	}

}
