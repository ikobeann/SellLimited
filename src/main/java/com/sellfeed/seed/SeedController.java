package com.sellfeed.seed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/seed")
public class SeedController {
	Logger logger = LoggerFactory.getLogger(SeedController.class);
	@Autowired
	public SeedLogic seedLogic = null;
}
