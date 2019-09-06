package com.sellfeed.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductLogic {
	Logger logger = LoggerFactory.getLogger(ProductLogic.class);
	@Autowired
	public ProductDao productDao = null;
}
