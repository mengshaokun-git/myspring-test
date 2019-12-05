package com.springtest.controller;

import com.springtest.service.TestService;
import com.springtest.utils.ServerResponse;
import meng.springframework.annotation.Autowired;
import meng.springframework.annotation.Controller;
import meng.springframework.annotation.RequestMapping;
import meng.springframework.annotation.param.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping("/test")
    public ServerResponse test(@RequestParam(required = false,value = "name",defaultValue = "123") String a,
                               @RequestParam("type") String type){
        return service.test(a);
    }

}
