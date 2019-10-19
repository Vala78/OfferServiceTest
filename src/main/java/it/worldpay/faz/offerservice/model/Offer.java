package it.worldpay.faz.offerservice.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name="OFFER")
public class Offer implements Serializable{

	private static final long serialVersionUID = -2517863847562585305L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, name = "OFFER_ID")
	private Long offerId;
	
	@Column(name = "OFFER_CODE")
	private String offerCode;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "OFFER_EXPIRING_DATE")
	private Date offerExpiringDate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "OFFER_STARTING_DATE")
	private Date offerStartingDate;
	
	@Column(name = "OFFER_DISCOUNT")
	private Integer offerDiscountPercent;
	
	@Column(name = "OFFER_DESCRIPTION")
	private String offerDescription;
	
	@Column(name = "IS_EXPIRED")
	private boolean isExpired;
	
	@OneToMany(mappedBy = "offerId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> productList;
	
	@ManyToOne()
	private CurrencyOffer currencyOffer;
	
	public Offer(){}

	public Offer(Long offerId, String offerCode, Date offerExpiringDate, Date offerStartingDate, 
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
