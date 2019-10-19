package it.worldpay.faz.offerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.worldpay.faz.offerservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
