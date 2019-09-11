package com.sellfeed.member;

import java.util.List;
import java.util.Map;

import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sellfeed.account.AccountLogic;

@Service
public class MemberLogic {
   Logger logger = LoggerFactory.getLogger(MemberLogic.class);
   @Autowired
   public MemberDao memberDao = null;
   @Autowired
   public AccountLogic accountLogic = null;
   
//   @Autowired
//   public AccountDao accountDao = null;

   @Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor= {DataAccessException.class})
   @Pointcut(value="execution(* com.sellfeed.member.*Logic.*(..)")
   public void memberIns(Map<String, Object> pMap) {
      logger.info("=================>memberIns 호출 성공");
      //트랜잭션처리
      //servlet-context.xml에 <tx:annotation-driven /> 넣어주기.
      try {
         memberDao.memberIns(pMap);
         accountLogic.accountIns(pMap);
         
      } catch (DataAccessException e) {
         e.printStackTrace();
      }
   }
   
   public String login(Map<String, Object> pMap) {
      logger.info("=================>login 호출 성공");
      String mem_name="";
      mem_name = memberDao.login(pMap);
      return mem_name;
   }

   public void memberUpd(Map<String, Object> pMap) {
      logger.info("=================>memberUpd 호출 성공");
      //회원정보 수정
      memberDao.memberUpd(pMap);
   }

   public void memberDel(Map<String, Object> pMap) {
      logger.info("=================>memberDel 호출 성공");
      memberDao.memberDel(pMap);
   }

   public List<Map<String, Object>> memberList(Map<String, Object> pMap) {
      logger.info("=================>memberList 호출 성공");
      List<Map<String,Object>> rList = null;
      rList = memberDao.memberList(pMap);
      return rList;
      
   }
}