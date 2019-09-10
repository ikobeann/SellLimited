package com.sellfeed.util;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sellfeed.account.AccountLogic;
import com.sellfeed.favorite.FavoriteLogic;

@RestController
@RequestMapping(value="/rest",produces="text/plain;charset=UTF-8")
public class RestSellFeedController {
	@Autowired
	public FavoriteLogic favoriteLogic = null;
	@Autowired
	public AccountLogic accountLogic = null;
	@GetMapping("/favSellerAdd.sf")
	public String favSellerAdd(@RequestParam Map pMap) {
		String result="";
		return result;
	}
	@GetMapping("/favProductAdd.sf")
	public String favProductAdd(@RequestParam Map pMap) {
		String result="";
		return result;
	}
	@GetMapping("/nowPoint.sf")
	public String nowPoint(@RequestParam Map pMap) {
		String result="";
		return result;
	}
}
