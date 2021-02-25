package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @ClassName IndexController
 * @Author RC
 * @date 2021.01.07 10:12
 */
@Controller
public class IndexController {

    @RequestMapping({"index","/"})
    public String index(){
        return "echarts";

    }

}
