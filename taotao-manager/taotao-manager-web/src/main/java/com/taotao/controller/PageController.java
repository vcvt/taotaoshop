package com.taotao.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

/**
 * 页面跳转controller
 * Created by smmit on 2016-12-23.
 */
@Controller
public class PageController {
    private static Log log = LogFactory.getLog(PageController.class);
    /*打开首页*/
    @RequestMapping("/")
    public String showIndex(){
        log.info("转到index.jsp页面");
        return "index";
    }

    /*展示其他页面*/
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
