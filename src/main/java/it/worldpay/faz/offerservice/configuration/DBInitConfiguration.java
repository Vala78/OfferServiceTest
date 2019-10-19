package it.worldpay.faz.offerservice.configuration;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import it.worldpay.faz.offerservice.model.CurrencyOffer;
import it.worldpay.faz.offerservice.model.Offer;
import it.worldpay.faz.offerservice.model.Product;
import it.worldpay.faz.offerservice.repository.CurrencyOfferRepository;
import it.worldpay.faz.offerservice.repository.OfferRepository;
import it.worldpay.faz.offerservice.repository.ProductRepository;
import it.worldpay.faz.offerservice.utility.CurrencyEnum;

@Component
public class DBInitConfiguration implements ApplicationRunner {
	
	@Autowired
	private CurrencyOfferRepository currencyOfferRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OfferRepository offerRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		List<CurrencyOffer> currencyList = currencyOfferRepository.findAll();
		if(currencyList.isEmpty()) {
			insertCurrecyOffer();
		}
		
		List<Product> productList = productRepository.findAll();
		if(productList.isEmpty()) {
			insertProduct();
		}
		
		List<Offer> offerList = offerRepository.findAll();
		if(offerList.isEmpty()) {
			insertOffer();
		}
	}

	private void insertCurrecyOffer() {
		
		List<CurrencyOffer> listCurrencies = new ArrayList<>();
		listCurrencies.add(new CurrencyOffer(1L, CurrencyEnum.EUR.toString()));
		listCurrencies.add(new CurrencyOffer(2L, CurrencyEnum.USD.toString()));
		listCurrencies.add(new CurrencyOffer(3L, CurrencyEnum.GBP.toString()));
		
		currencyOfferRepository.saveAll(listCurrencies);
	}
	
	private void insertProduct() {
		
		List<Product> listProducts = new ArrayList<>();
		listProducts.add(new Product(1L, "Chianti", "Red wine to enjoy yor meals", 
					new BigDecimal(25.0), null));
		listProducts.add(new Product(2L, "Peroni", "A refreshing beer", 
					new BigDecimal(4.0), null));
		
		productRepository.saveAll(listProducts);
	}
	
	private void insertOffer() throws ParseException {
		
		List<Offer> listOffers = new ArrayList<>();
		listOffers.add(new Offer(1L, "OP1", new SimpleDateFormat("yyyy-MM-dd").parse("2019-12-31 11:00"), 
							new SimpleDateFormat("yyyy-MM-dd").parse("2019-12-01 11:00"), 25, 
							"Have a great Christmas", false, new ArrayList<Product>(), 
							new CurrencyOffer(3L, CurrencyEnum.GBP.toString())));
		
		listOffers.add(new Offer(2L, "OP2", new SimpleDateFormat("yyyy-MM-dd").parse("2019-10-31 11:00"), 
							new SimpleDateFormat("yyyy-MM-dd").parse("2019-10-29 11:00"), 15, 
							"Happy Friday", false, new ArrayList<Product>(), 
							new CurrencyOffer(1L, CurrencyEnum.EUR.toString())));
		
		offerRepository.saveAll(listOffers);
	}

}
