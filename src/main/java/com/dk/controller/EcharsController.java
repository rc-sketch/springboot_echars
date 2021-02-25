package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @ClassName EcharsController
 * @Author RC
 * @date 2021.01.07 11:06
 */
@Controller
@RequestMapping("echars")
public class EcharsController {

    @RequestMapping("getChars")
    @ResponseBody
    public Map<String,Object> getChars(){
        Map<String,Object> map = new HashMap<>();
        String[] type = {"赵","钱","孙","里"};
        //String[] type1 = {"周","吴","郑","王",};
        int[] data = {11,22,50,100,};
        int[] data1 = {80,100,10,30,};
        map.put("type",type);
        map.put("data",data);
        map.put("data1",data1);
        return map;
    }
}
