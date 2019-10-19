package it.worldpay.faz.offerservice.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity(name="PRODUCT")
public class Product implements Serializable{
	
	private static final long serialVersionUID = 6731827270463363746L;
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, name = "PRODUCT_ID")
	private Long productId;
	
	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "PRODUCT_DESCR")
	private String productDescription;
	
	@Column(name = "PRODUCT_PRICE")
	private BigDecimal productPrice;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_OFFERID")
	private Offer offerId;
	
	public Product() {}
	
	public Product(Long productId, String productName, String productDescription, 
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
