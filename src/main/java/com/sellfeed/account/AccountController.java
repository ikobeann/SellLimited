package com.sellfeed.account;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/account")
public class AccountController {
	Logger logger = LoggerFactory.getLogger(AccountController.class);
	@Autowired
	public AccountLogic accountLogic = null;
}
