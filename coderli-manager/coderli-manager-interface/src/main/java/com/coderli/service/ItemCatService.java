package com.coderli.service;

import java.util.List;

import com.coderli.common.pojo.EasyUITreeNode;

public interface ItemCatService {
	List<EasyUITreeNode> getItemCatList(long parentId);
}
