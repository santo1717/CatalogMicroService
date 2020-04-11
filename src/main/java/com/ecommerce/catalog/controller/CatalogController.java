package com.ecommerce.catalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/catalog")
@RestController
public class CatalogController {
	
	
	@GetMapping("/getCatalog")
	public String getCatalog()
	{
		return "NAAPTOL CATALOG";
	}

}
