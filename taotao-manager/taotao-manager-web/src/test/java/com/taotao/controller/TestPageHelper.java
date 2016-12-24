package com.taotao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by smmit on 2016-12-24.
 */
public class TestPageHelper {

    @Test
    public void testPageHelper(){
        //创建一个spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        //从spring容器中获得Mapper对象
        TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class);
        //执行查询并分页
        TbItemExample example = new TbItemExample();
        //获取第几页，每页多少条
        PageHelper.startPage(2,10);
        List<TbItem> list = mapper.selectByExample(example);
        //取商品类别
        for(TbItem tbItem : list){
            System.out.println(tbItem.getTitle());
        }
        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        Long total = pageInfo.getTotal();
        System.out.println("共有商品: " + total);
    }
}
