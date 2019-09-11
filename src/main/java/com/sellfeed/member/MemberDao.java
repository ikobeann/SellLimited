package com.sellfeed.member;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class MemberDao {
	Logger logger = LoggerFactory.getLogger(MemberDao.class);
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate = null;
	
	public void memberIns(Map<String, Object> pMap) {
		logger.info("================>memberIns 호출 성공");
		sqlSessionTemplate.update("memberIns",pMap);
	}

	public String login(Map<String, Object> pMap) {
		logger.info("================>login 호출 성공");
		String mem_name = null;
		mem_name = sqlSessionTemplate.selectOne("login",pMap);
		return mem_name;
	}

	public void memberUpd(Map<String, Object> pMap) {
		logger.info("================>memberUpd 호출 성공");
		sqlSessionTemplate.update("memberUpd",pMap);
	}

	public void memberDel(Map<String, Object> pMap) {
		logger.info("================>memberDel 호출 성공");
		sqlSessionTemplate.update("memberDel",pMap);
		
	}

	public List<Map<String, Object>> memberList(Map<String, Object> pMap) {
		logger.info("================>memberList 호출 성공");
		List<Map<String,Object>> rList = null;
		rList = sqlSessionTemplate.selectList("memberList",pMap);
		return rList;
		
	}

	

}
