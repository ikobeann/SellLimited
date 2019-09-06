package com.sellfeed.aucLog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AucLogLogic {
	Logger logger = LoggerFactory.getLogger(AucLogLogic.class);
	@Autowired
	public AucLogDao aucLogDao = null;
}
