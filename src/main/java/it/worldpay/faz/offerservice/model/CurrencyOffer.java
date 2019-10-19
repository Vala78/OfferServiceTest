package it.worldpay.faz.offerservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name="CURRENCY_OFFER")
public class CurrencyOffer {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, name = "CURRENCY_ID")
	private Long currencyId;
	
	@Column(name="CURRENCY_DESCR")
	private String currencyDescription;
	
	public CurrencyOffer() {}
	
	public CurrencyOffer(Long currencyId, String currencyDescription) {
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
