package org.cx.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cx.model.Item;
import org.cx.model.ShopCar;
import org.cx.service.ItemService;
import org.cx.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Scope("prototype")
@Controller
@RequestMapping(value = "/trans")
public class TransactionTest {
	
	@Autowired
	@Qualifier("itemService")
	private ItemService itemService;
	
	@Autowired
	@Qualifier("shopCarService")
	private ShopCarService shopCarService;
	
	private static Log log = LogFactory.getLog(TransactionTest.class);
	
	private Map<String, Object> result = new HashMap<String, Object>();
	
	@RequestMapping("/test")
	@ResponseBody
	public Map<String, Object> test() throws Exception {
		try {
			shopCarService.insertAndUpdate(new ShopCar());
			log.info("--------------");
			result.put("", "");
		} catch (Exception e) {
			log.error("err========="+this,e);
			throw new Exception();
		}
		return result;
	}
	
	
	@RequestMapping("/test2")
	@ResponseBody
	public Map<String, Object> test2() throws Exception {
		try {
			shopCarService.insert(new ShopCar());
		} catch (Exception e) {
			throw new Exception();
		}
		return result;
	}
}
