package org.cx.service.impl;

import java.util.Date;
import java.util.List;

import org.cx.mapper.ItemMapper;
import org.cx.model.Item;
import org.cx.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	@Qualifier("itemMapper")
	private ItemMapper itemMapper;
	
	public int insert(Item item) throws Exception {
		item.setCreateTime(new Date());
		item.setUpdateTime(new Date());
		return itemMapper.insert(item);
	}

	public List<Item> selectByParam(Item item) throws Exception {
		return itemMapper.selectByParam(item);
	}

	public Item selectByPrimaryKey(Integer id) throws Exception {
		return itemMapper.selectByPrimaryKey(id);
	}

	public int updateById(Item item) throws Exception {
		item.setUpdateTime(new Date());
		return itemMapper.updateById(item);
	}

	public int deleteById(Integer id) throws Exception {
		return itemMapper.deleteById(id);
	}

	public int updateSkuNumById(Integer id, Integer skuNum, Integer version) throws Exception {
		Item param = new Item();
		param.setId(id);
		param.setSkuNum(skuNum);
		param.setVersion(version);
		return itemMapper.updateSkuNumById(param);
	}

}
