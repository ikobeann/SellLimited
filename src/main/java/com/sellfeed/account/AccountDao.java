package com.sellfeed.account;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountDao {
	Logger logger = LoggerFactory.getLogger(AccountDao.class);
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate = null;
	
	public void accountIns(Map<String, Object> pMap) {
		logger.info("=================>accountIns 호출 성공");
		sqlSessionTemplate.update("accountIns",pMap);
	}

	public String getAcct_number() {
		logger.info("=================>getAcct_number 호출 성공");
		String acct_number = "";
		acct_number = sqlSessionTemplate.selectOne("getAcct_number");
		return acct_number;
	}
	
}
