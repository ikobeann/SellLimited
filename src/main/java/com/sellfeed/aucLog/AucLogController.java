package com.sellfeed.aucLog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/aucLog")
public class AucLogController {
	Logger logger = LoggerFactory.getLogger(AucLogController.class);
	@Autowired
	public AucLogLogic aucLogLogic = null;
}
