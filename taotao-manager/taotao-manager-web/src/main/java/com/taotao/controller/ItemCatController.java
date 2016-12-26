package com.taotao.controller;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.service.ItemCatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品分类管理
 * Created by Administrator
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Resource
    private ItemCatService itemCatService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EUTreeNode> getCatList(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        return itemCatService.getCatList(parentId);
    }
}
