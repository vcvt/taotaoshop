package com.taotao.service.impl;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.service.ItemCatService;
import com.taotao.pojo.TbItemCatExample.Criteria;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Resource
    private TbItemCatMapper itemCatMapper;
    @Override
    public List<EUTreeNode> getCatList(Long parentId) {
        //创建查询条件
        TbItemCatExample example = new TbItemCatExample();
        Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //根据条件查询
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        List<EUTreeNode> resultList = new ArrayList<>();
        //把列表转换成treeNodeList
        for(TbItemCat tbItemCat : list){
            EUTreeNode node = new EUTreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            resultList.add(node);
        }
        return resultList;
    }
}
