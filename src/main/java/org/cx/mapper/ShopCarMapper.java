package org.cx.mapper;


import java.util.List;

import org.cx.model.ShopCar;

public interface ShopCarMapper {
	public int deleteByPrimaryKey(Integer id);

	public int insert(ShopCar shopCar);

	public List<ShopCar> selectByParam(ShopCar shopCar);
	
	public ShopCar selectByPrimaryKey(Integer id);

	public int updateById(ShopCar shopCar);
}