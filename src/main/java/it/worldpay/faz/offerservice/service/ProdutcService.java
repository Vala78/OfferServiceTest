package it.worldpay.faz.offerservice.service;

import java.util.List;

import it.worldpay.faz.offerservice.dto.ProductDTO;
import it.worldpay.faz.offerservice.model.Product;

public interface ProdutcService {
	
	public List<ProductDTO> getAllProducts();
	public void createProduct(Product product);
	public void updateProduct(Long productId);
	public void deleteProduct(Long productId);

}
