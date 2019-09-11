package com.sellfeed.product;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
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
@RequestMapping(value="/product")
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
		if(productList!=null&&productList.size()>0) {
			path="";
		}
		return path;
	}
	
	@PostMapping("productIns")
	public String productIns(@RequestParam Map<String, Object> pMap,
			 				@RequestParam (value="product_file", required=false) MultipartFile product_file) {
		logger.info("Controller| Call productIns");
		String savePath =  "";
		String filename =  null;
		String fullPath = null;
		//÷������ ���� Ȯ��
		if(product_file!=null && !product_file.isEmpty()) {
			filename =  product_file.getOriginalFilename();
			fullPath = savePath+"\\"+filename;
			try {
				File file = new File(fullPath);//���ϸ� �����ϰ� ������ ����
				byte[] bytes = product_file.getBytes();
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(file));
				bos.write(bytes);
				bos.close();
				//����ũ�� �ʱ�ȭ
				long size = file.length();
				double d_size = Math.floor(size/1024.0);
				pMap.put("product_file",filename);
				pMap.put("bs_size",d_size);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		result=productLogic.productIns(pMap);
		if(result==1) {
			path = "���ؾ���";
		}else {
			path = "redirect:ProductInsertError.jsp";			
		}
		return path;
	}
	@PostMapping("productUpd")
	public String productUpd(@RequestParam Map<String,Object> pMap) {
		logger.info("Controller| Call productUpd");
		result = productLogic.productUpd(pMap);
		if(result==1) {
			path = "���ؾ���";
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
			path = "���ؾ���";
		}else {
			path = "";			
		}
		return path;
	}

	
}
