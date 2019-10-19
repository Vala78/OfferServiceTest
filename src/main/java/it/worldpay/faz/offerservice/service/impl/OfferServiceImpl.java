package it.worldpay.faz.offerservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.worldpay.faz.offerservice.dto.OfferDTO;
import it.worldpay.faz.offerservice.dto.mapper.OfferMapper;
import it.worldpay.faz.offerservice.model.Offer;
import it.worldpay.faz.offerservice.model.Product;
import it.worldpay.faz.offerservice.repository.OfferRepository;
import it.worldpay.faz.offerservice.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService {
	
	private static final Logger log = LoggerFactory.getLogger(OfferServiceImpl.class);
	
	@Autowired
	private OfferRepository offerRepository;

	@Override
	public List<OfferDTO> getAllOffers() throws Exception {
		log.info("getAllOffersDTO()");
		
		List<OfferDTO> listOfferDTO = OfferMapper.mapFrom(offerRepository.findAll().stream()
												 .filter(offer -> offer.isExpired() != true)
												 .collect(Collectors.toList()));
		
		if(listOfferDTO.size() == 0) {
			throw new Exception("List is empty");
		}
		
		return listOfferDTO;
	}
	
	@Override
	public OfferDTO getOfferById(Long offerId) throws Exception {
		log.info("getOfferDTO()");
		
		OfferDTO offerDTO = OfferMapper.from(offerRepository.findById(offerId)
									 .orElseThrow(() -> new Exception("Offer not found")));
		return offerDTO;
	}

	@Override
	@Transactional
	public void createOffer(OfferDTO offerDTO) throws Exception {
		log.info("createOffer() {offerDTO}");
		
		if (offerDTO.getOfferId() != null) {
			
			throw new Exception("The ID must be null to create a new offer");
		}else {
			
			Offer duplicateRecord = offerRepository.findByOfferCode(offerDTO.getOfferCode().toLowerCase());
			
			if (duplicateRecord != null) {
				throw new Exception("Offer already exist");
			}
			
			Offer offer = OfferMapper.to(offerDTO);
			offerRepository.save(offer);
		}
	}

	@Override
	@Transactional
	public void updateOffer(OfferDTO offerDTO) throws Exception {
		log.info("updateOffer() {offerDTO}");
		
		Offer offer = OfferMapper.to(offerDTO);
		offerRepository.save(offer);
	}

	@Override
	@Transactional
	public void deleteOffer(OfferDTO offerDTO) {
		log.info("deleteOffer() {offerDTO}");
		
		Offer offer = OfferMapper.to(offerDTO);
		offerRepository.delete(offer);

	}

	@Override
	@Transactional
	public void addProductsToOffer(List<Product> listProducts) {
		log.info("addProductsToOffer() {listProducts}");

	}

}
