package it.worldpay.faz.offerservice.utility;

public class Paths {
	
	/**
	 * It verifies that the service is up and running
	 */
	public static final String CHECK = "/check";
	
	/**
	 * Root for endpoints v1
	 */
	public static final String V1 = "/v1";
	
	/**
	 * OfferController paths
	 */
	public static final String V1_OFFERS = V1 + "/offers";
	public static final String V1_OFFERS_ID = V1_OFFERS + "/{id}";
}
