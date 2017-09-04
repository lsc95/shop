package com.coderli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderli.common.pojo.EasyUIDataGridResult;
import com.coderli.pojo.TbItem;
import com.coderli.service.ItemService;


/**
 * 商品管理Controller
 * @author lishichun
 *
 */
@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId){
		TbItem tbItem = itemService.getItemById(itemId);
		System.out.println(tbItem);
		return tbItem;
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(Integer page,Integer rows){
		//调用查询商品列表
		EasyUIDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
}
