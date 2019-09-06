package com.sellfeed.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/product")
public class ProductController {
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	public ProductLogic productLogic = null;
}
