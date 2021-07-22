package com.pdoley.zapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pdoley.zapp.model.ProductCatalogue;

@RestController
public class ProductCatalogueController {

	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public ProductCatalogue firstPage() {

		ProductCatalogue catalogue = new ProductCatalogue();
		catalogue.setOriginCountry("Mars");
		catalogue.setProductBrand("X-Athlean");
		catalogue.setProductColor("Red");
		catalogue.setProductName("Marvel Stone");
		catalogue.setProductPrice(250.00);
		
	return catalogue;
		
	}
	
	//TODO: Enhancement - 1 : Let's use Object Creation Pattern -- BUILDER PATTERN
	//TODO: Enhancement - 3 : Use JPA Microservice
}
