package com.sellfeed.aucProc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/aucProc")
public class AucProcController {
	Logger logger = LoggerFactory.getLogger(AucProcController.class);
	@Autowired
	public AucProcLogic aucProcLogic = null;
}
