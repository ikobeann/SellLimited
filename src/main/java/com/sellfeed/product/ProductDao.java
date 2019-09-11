package com.sellfeed.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
	Logger logger = LoggerFactory.getLogger(ProductLogic.class);
	int result =0;
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate = null;
//��	Select
	public List<Map<String, Object>> productList(Map<String, Object> pMap) {
		logger.info("ProductDao| Call productList");
		List<Map<String,Object>> productList = null;
		productList = sqlSessionTemplate.selectList("productList",pMap);
		return null;
	}
//��	Insert
	public int ProductIns(Map<String, Object> pMap) {
		logger.info("ProductDao| Call productIns");
		result = sqlSessionTemplate.selectOne("productIns",pMap);
		return result;
	}
//��	Update
	public int productUpd(Map<String, Object> pMap) {
		result = sqlSessionTemplate.update("productUpd",pMap);
		return result;
	}
//��	Delete
	public int productDel(Map<String, Object> pMap) {
		logger.info("ProductDao| Call productDel");
		result = sqlSessionTemplate.delete("productDel",pMap);
		return result;
	}
}
