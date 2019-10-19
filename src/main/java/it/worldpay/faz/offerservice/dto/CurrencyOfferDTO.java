package it.worldpay.faz.offerservice.dto;

public class CurrencyOfferDTO {
	
	private Long currencyId;
	private String currencyDescription;
	
	public CurrencyOfferDTO() {}
	
	public CurrencyOfferDTO(Long currencyId, String currencyDescription) {
		this.currencyId = currencyId;
		this.currencyDescription = currencyDescription;
	}
	
	public Long getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}
	public String getCurrencyDescription() {
		return currencyDescription;
	}
	public void setCurrencyDescription(String currencyDescription) {
		this.currencyDescription = currencyDescription;
	}

}
