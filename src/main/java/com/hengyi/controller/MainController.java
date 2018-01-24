package com.hengyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hengyi.dzfilter.utils.TextUtils;

@Controller
public class MainController {
    
    @RequestMapping(value="/",produces="text/html;charset=utf-8")
    public String IndexPage() {
        return "index";
    }
    
    //过滤消息
    @RequestMapping(value="/filter",produces="text/html;charset=utf-8")
    @ResponseBody
    public String FilterPage(@RequestParam String content) {
        return TextUtils.filter(content);
    }
    
    
    @RequestMapping(value="/delfilter",produces="text/html;charset=utf-8")
    @ResponseBody
    public String DelFilterPage(@RequestParam String content) {
        return "删除结果：" + TextUtils.delFilter(content);
    }
}
