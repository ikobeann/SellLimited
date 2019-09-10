package com.sellfeed.account;

import java.util.Map;

import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountLogic {
	Logger logger = LoggerFactory.getLogger(AccountLogic.class);
	@Autowired
	public AccountDao accountDao = null;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor= {DataAccessException.class})
	@Pointcut(value="execution(* com.sellfeed.account.*Logic.*(..)")
	public void accountIns(Map<String, Object> pMap) {
		logger.info("=================>accountIns 호출 성공");
		String acct_number = "";
		try {
			acct_number = accountDao.getAcct_number();
			pMap.put("acct_number", acct_number);
			accountDao.accountIns(pMap);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}
}
