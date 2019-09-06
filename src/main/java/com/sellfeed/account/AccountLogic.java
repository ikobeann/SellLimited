package com.sellfeed.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountLogic {
	Logger logger = LoggerFactory.getLogger(AccountLogic.class);
	@Autowired
	public AccountDao accountDao = null;
}
