package it.worldpay.faz.offerservice.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import it.worldpay.faz.offerservice.dto.ProductDTO;
import it.worldpay.faz.offerservice.model.Product;

public class ProductMapper {
	
	public static ProductDTO from(Product product) {
		
		return new ProductDTO(
				product.getProductId(),
				product.getProductName(),
				product.getProductDescription(),
				product.getProductPrice(),
				product.getOfferId()
				);
	}
	
	public static Product to(ProductDTO product) {
		
		return new Product(
				product.getProductId(),
				product.getProductName(),
				product.getProductDescription(),
				product.getProductPrice(),
				product.getOfferId()
				);
	}
	
	public static List<ProductDTO> mapFrom(List<Product> listProduct){
		return listProduct.stream().map(ProductMapper::from).collect(Collectors.toList());
	}
	
	public static List<Product> mapTo(List<ProductDTO> listProduct){
		return listProduct.stream().map(ProductMapper::to).collect(Collectors.toList());
	}
}
