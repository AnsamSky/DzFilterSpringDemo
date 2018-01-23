package com.hengyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
    @RequestMapping(value="/",produces="text/html;charset=utf-8")
    public String IndexPage() {
        return "index";
    }

}
