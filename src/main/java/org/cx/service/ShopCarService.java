package org.cx.service;

import java.util.List;

import org.cx.model.ShopCar;


public interface ShopCarService {
	
	public int deleteByPrimaryKey(Integer id) throws Exception;

	public int insert(ShopCar shopCar) throws Exception;

	public int insertAndUpdate(ShopCar shopCar) throws Exception;

	public List<ShopCar> selectByParam(ShopCar shopCar) throws Exception;
	
	public ShopCar selectByPrimaryKey(Integer id) throws Exception;

	public int updateById(ShopCar shopCar) throws Exception;
	
	public int updateItemBuyNumById(ShopCar shopCar) throws Exception;
}
