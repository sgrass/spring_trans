package org.cx.service;

import java.util.List;

import org.cx.model.Item;

public interface ItemService {

	public int insert(Item item) throws Exception;

	public List<Item> selectByParam(Item item) throws Exception;

	public Item selectByPrimaryKey(Integer id) throws Exception;

	public int updateById(Item item) throws Exception;
	
	public int updateSkuNumById(Integer id, Integer skuNum, Integer version) throws Exception;
	
	public int deleteById(Integer id) throws Exception;
}
