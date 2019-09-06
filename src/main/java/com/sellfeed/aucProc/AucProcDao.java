package com.sellfeed.aucProc;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AucProcDao {
	Logger logger = LoggerFactory.getLogger(AucProcDao.class);
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate = null;
}
