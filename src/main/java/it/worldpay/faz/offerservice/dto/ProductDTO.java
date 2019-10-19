package it.worldpay.faz.offerservice.dto;

import java.math.BigDecimal;

import it.worldpay.faz.offerservice.model.Offer;

public class ProductDTO {
	
	private Long productId;
	private String productName;
	private String productDescription;
	private BigDecimal productPrice;
	private Offer offerId;
	
	public ProductDTO() {}
	
	public ProductDTO(Long productId, String productName, String productDescription, 
			BigDecimal productPrice, Offer offerId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.offerId = offerId;
	}
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	public Offer getOfferId() {
		return offerId;
	}
	public void setOfferId(Offer offerId) {
		this.offerId = offerId;
	}
	
}
