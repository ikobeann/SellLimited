package com.sellfeed.aucProc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AucProcLogic {
	Logger logger = LoggerFactory.getLogger(AucProcLogic.class);
	@Autowired
	public AucProcDao aucProcDao = null; 
}
