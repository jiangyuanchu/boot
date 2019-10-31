package com.suixingpay.web;

import com.suixingpay.service.RegisterServicempl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@ResponseBody
@RequestMapping("/test")
public class TestController {
    @Autowired
    private RegisterServicempl registerService;

    @RequestMapping("getResult")
    public String home(){

        return "index";
//        registerService.getPassword("456")
    }
}
