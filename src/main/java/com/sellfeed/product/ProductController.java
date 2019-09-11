package com.sellfeed.product;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping(value="/product/*")
public class ProductController {
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	String path;
	int result;
	@Autowired
	public ProductLogic productLogic = null;
	
	@GetMapping("productList")
	public String productList(@RequestParam Map<String, Object> pMap) {
		logger.info("Controller| Call productList");
		List<Map<String,Object>> productList = null;
		
		productList=productLogic.productList(pMap);
		
//		System.out.println("$$$$$$$$$$$$$$$$$$$셀렉트 단위테스트"+productList.get(0)); 		 ★CLEAR
		if(productList!=null&&productList.size()>0) {
			path="";
		}
		return path;
	}
	
	@PostMapping("productIns")
	public String productIns(@RequestParam Map<String, Object> pMap1,
			 				@RequestParam (value="attached_file", required=false) MultipartFile product_file) {
		logger.info("Controller| Call productIns");
		String savePath =  "";
		String filename =  null;
		String fullPath = null;
		//첨부파일 존재 확인
		Map<String,Object> pMap = new HashMap<String,Object>();
		if(product_file!=null && !product_file.isEmpty()) {
			filename =  product_file.getOriginalFilename();
			fullPath = savePath+"\\"+filename;
			try {
				File file = new File(fullPath);//파일명만 존재하고 내용은 없는
				byte[] bytes = product_file.getBytes();
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(file));
				bos.write(bytes);
				bos.close();
				//파일크기 초기화
				long size = file.length();
				double d_size = Math.floor(size/1024.0);
				pMap.put("product_file",filename);
				pMap.put("bs_size",d_size);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		pMap.put("mem_id", "InsertTest")          ;
		pMap.put("brand", "InsertTest")           ;
		pMap.put("product_name", "InsertTest")    ;
		pMap.put("status", "InsertTest")          ;
		pMap.put("admin_ok", "InsertTest")        ;
		pMap.put("warranty", "InsertTest")        ;
		pMap.put("sub_category", "베이스기타")    ;
		pMap.put("modelname", "InsertTest")       ;
		pMap.put("explanation", "InsertTest")     ;
		pMap.put("attached_file", "")   ;
		pMap.put("bid_title", "InsertTest")       ;
		pMap.put("bid_state", "InsertTest")       ;
		pMap.put("start_price", "1111")     ;
		result = productLogic.productIns(pMap);
		if(result==1) {
			path = "정해야함";
		}else {
			path = "redirect:ProductInsertError.jsp";			
		}
		return path;
	}
	@PostMapping("productUpd")
	public String productUpd(@RequestParam Map<String,Object> pMap) {
		logger.info("Controller| Call productUpd");
		pMap.put("brand","fender");
		pMap.put("product_name","재즈마스터");
		pMap.put("status","A");
		pMap.put("admin_ok","AA");
		pMap.put("sub_category","AA");
		pMap.put("modelname","AA");
		pMap.put("explanation","AA");
		pMap.put("attached_file","AA");
		pMap.put("mem_id","uh4ng");
		result = productLogic.productUpd(pMap);
		if(result==1) {
			path = "정해야함";
		}else {
			path = "";			
		}
		return path;
	}
	@GetMapping("productDel")
	public String productDel(@RequestParam Map<String,Object> pMap) {
		logger.info("Controller| Call productDel");
		result = productLogic.productDel(pMap);
		if(result==1) {
			path = "정해야함";
		}else {
			path = "";			
		}
		return path;
	}

	
}
