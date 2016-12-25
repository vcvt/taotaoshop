package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

import java.util.List;

/**
 * Created by smmit on 2016-12-23.
 */
public interface ItemService {

    TbItem getItemById(long itemId);

    EUDataGridResult getItemList(int page, int rows);
}
