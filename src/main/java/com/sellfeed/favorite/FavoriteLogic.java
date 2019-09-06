package com.sellfeed.favorite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteLogic {
	Logger logger = LoggerFactory.getLogger(FavoriteLogic.class);
	@Autowired
	public FavoriteDao favoriteDao = null;
}
