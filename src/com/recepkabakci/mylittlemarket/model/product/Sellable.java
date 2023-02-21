package com.recepkabakci.mylittlemarket.model.product;

public interface Sellable {

	int price();
	double calcEndprice (double discountRate);
	void sell(int sellingAmount);
	
	default void notifySell () {
		System.out.println("Ürün satıldı");
	}
	
	
}
