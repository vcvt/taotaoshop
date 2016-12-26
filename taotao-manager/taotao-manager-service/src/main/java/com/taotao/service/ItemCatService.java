package com.taotao.service;

import com.taotao.common.pojo.EUTreeNode;

import java.util.List;

/**
 * Created by Administrator
 */
public interface ItemCatService {

    List<EUTreeNode> getCatList(Long parentId);   //返回目录列表
}
