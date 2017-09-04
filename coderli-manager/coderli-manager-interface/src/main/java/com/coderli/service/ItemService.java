package com.coderli.service;

import com.coderli.common.pojo.EasyUIDataGridResult;
import com.coderli.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page,int rows);
	
}
