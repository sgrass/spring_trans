package org.cx.service.impl;

import java.util.Date;
import java.util.List;

import org.cx.mapper.ItemMapper;
import org.cx.mapper.ShopCarMapper;
import org.cx.model.Item;
import org.cx.model.ShopCar;
import org.cx.service.ItemService;
import org.cx.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("shopCarService")
@Transactional(propagation=Propagation.REQUIRED,rollbackFor={Exception.class})
public class ShopCarServiceImpl implements ShopCarService {

	@Autowired
	@Qualifier("shopCarMapper")
	private ShopCarMapper shopCarMapper;
	
	@Autowired
	@Qualifier("itemMapper")
	private ItemMapper itemMapper;
	
	@Autowired
	@Qualifier("itemService")
	private ItemService itemService;
	
	public int deleteByPrimaryKey(Integer id) throws Exception {
		return shopCarMapper.deleteByPrimaryKey(id);
	}

	public int insert(ShopCar shopCar) throws Exception {
		shopCar.setItemId(1);
		shopCar.setOpenId("1111");
		shopCar.setBuyNum(2);
		shopCar.setCreateTime(new Date());
		int shopResult = shopCarMapper.insert(shopCar);
		
		Item item = itemService.selectByPrimaryKey(null);
		item.setSkuNum(item.getSkuNum()-2);
		int itemResult = itemService.updateSkuNumById(1,item.getSkuNum(),2);
		
		return shopResult == itemResult? 1:0;
	}
	
	public int insertAndUpdate(ShopCar shopCar) throws Exception {
		shopCar.setItemId(1);
		shopCar.setOpenId("1111");
		shopCar.setBuyNum(2);
		shopCar.setCreateTime(new Date());
		int shopResult = shopCarMapper.insert(shopCar);
		
		Item item = itemMapper.selectByPrimaryKey(null);
		item.setSkuNum(item.getSkuNum()-2);
		int itemResult = itemMapper.updateSkuNumById(item);
//		throw new RuntimeException();
		return shopResult == itemResult? 1:0;
	}

	public List<ShopCar> selectByParam(ShopCar shopCar) throws Exception {
		return shopCarMapper.selectByParam(shopCar);
	}

	public ShopCar selectByPrimaryKey(Integer id) throws Exception {
		return shopCarMapper.selectByPrimaryKey(id);
	}

	public int updateById(ShopCar shopCar) throws Exception {
		shopCar.setUpdateTime(new Date());
		return shopCarMapper.updateById(shopCar);
	}

	public int updateItemBuyNumById(ShopCar shopCar) throws Exception {
		Item item = itemMapper.selectByPrimaryKey(shopCar.getItemId());
		if (item == null) {
			return -1;
		}
		if (item.getSkuNum() < shopCar.getBuyNum()) {
			return -1;
		}
		return this.updateById(shopCar);
	}

}
