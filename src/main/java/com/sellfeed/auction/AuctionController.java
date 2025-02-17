package com.sellfeed.auction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/auction")
public class AuctionController {
	Logger logger = LoggerFactory.getLogger(AuctionController.class);
	@Autowired
	public AuctionLogic auctionLogic = null;
}
