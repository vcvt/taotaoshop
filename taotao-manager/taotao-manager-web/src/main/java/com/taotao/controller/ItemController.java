package com.taotao.controller;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by smmit on 2016-12-23.
 */
/*把spring context包添加到taotao-manger-web依赖中去，不会报Controller异常*/
@Controller
@RequestMapping("/item")
public class ItemController {
    private static Log log = LogFactory.getLog(PageController.class);
    @Resource
    private ItemService itemService;

    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
        return itemService.getItemById(itemId);
    }

    @RequestMapping("/list")
    @ResponseBody
    public EUDataGridResult getItemList(Integer page,Integer rows){
        log.warn(System.currentTimeMillis() + "访问订单列表");
        return itemService.getItemList(page,rows);
    }
}
