package com.sellfeed.auction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuctionLogic {
	Logger logger = LoggerFactory.getLogger(AuctionLogic.class);
	@Autowired
	public AuctionDao auctionDao = null;
}
