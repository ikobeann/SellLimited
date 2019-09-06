package com.sellfeed.auction;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuctionDao {
	Logger logger = LoggerFactory.getLogger(AuctionDao.class);
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate = null;
}
