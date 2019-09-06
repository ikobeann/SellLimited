package com.sellfeed.seed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeedLogic {
	Logger logger = LoggerFactory.getLogger(SeedLogic.class);
	@Autowired
	public SeedDao seedDao = null;
}
