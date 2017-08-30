package com.coderli.pagehelper;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coderli.mapper.TbItemMapper;
import com.coderli.pojo.TbItem;
import com.coderli.pojo.TbItemExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class PageHelperTest {
	@Test
	public void testPageHelper()throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		TbItemMapper itemMapper = ac.getBean(TbItemMapper.class);
		//执行sql语句之前设置分页信息,只对下面一条sql有效
		PageHelper.startPage(1, 1);
		//执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		//取分页信息，PageInfo 
		PageInfo<TbItem> pageInfo=new PageInfo<>(list);
		System.out.println(pageInfo.getTotal());
		System.out.println(pageInfo.getPages());
		System.out.println(pageInfo.getEndRow());
		System.out.println(list.size());
	}
}
