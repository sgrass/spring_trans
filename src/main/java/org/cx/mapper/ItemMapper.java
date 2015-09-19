package org.cx.mapper;


import java.util.List;

import org.cx.model.Item;

public interface ItemMapper {
	public int insert(Item item);

	public List<Item> selectByParam(Item item);

	public Item selectByPrimaryKey(Integer id);

	public int updateById(Item item);
	
	public int updateSkuNumById(Item item);
	
	public int deleteById(Integer id);
}