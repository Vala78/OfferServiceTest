package it.worldpay.faz.offerservice.dto;

import java.util.Date;
import java.util.List;

import it.worldpay.faz.offerservice.model.CurrencyOffer;
import it.worldpay.faz.offerservice.model.Product;

public class OfferDTO {
	
	private Long offerId;
	private String offerCode;
	private Date offerExpiringDate;
	private Date offerStartingDate;
	private Integer offerDiscountPercent;
	private String offerDescription;
	private boolean isExpired;
	private List<Product> productList;
	private CurrencyOffer currencyOffer;
	
	public OfferDTO(){}

	public OfferDTO(Long offerId, String offerCode, Date offerExpiringDate, Date offerStartingDate, 
			Integer offerDiscountPercent, String offerDescription, boolean isExpired, 
			List<Product> productList, CurrencyOffer currencyOffer) {
		super();
		this.offerId = offerId;
		this.offerCode = offerCode;
		this.offerExpiringDate = offerExpiringDate;
		this.offerStartingDate = offerStartingDate;
		this.offerDiscountPercent = offerDiscountPercent;
		this.offerDescription = offerDescription;
		this.isExpired = isExpired;
		this.productList = productList;
		this.currencyOffer = currencyOffer;
	}

	public Long getOfferId() {
		return offerId;
	}

	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public Date getOfferExpiringDate() {
		return offerExpiringDate;
	}

	public void setOfferExpiringDate(Date offerExpiringDate) {
		this.offerExpiringDate = offerExpiringDate;
	}

	public Date getOfferStartingDate() {
		return offerStartingDate;
	}

	public void setOfferStartingDate(Date offerStartingDate) {
		this.offerStartingDate = offerStartingDate;
	}

	public Integer getOfferDiscountPercent() {
		return offerDiscountPercent;
	}

	public void setOfferDiscountPercent(Integer offerDiscountPercent) {
		this.offerDiscountPercent = offerDiscountPercent;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public boolean isExpired() {
		return isExpired;
	}

	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public CurrencyOffer getCurrencyOffer() {
		return currencyOffer;
	}

	public void setCurrencyOffer(CurrencyOffer currencyOffer) {
		this.currencyOffer = currencyOffer;
	}
}
