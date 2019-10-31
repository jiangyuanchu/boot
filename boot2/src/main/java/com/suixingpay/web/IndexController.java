package com.suixingpay.web;

import com.suixingpay.service.RegisterServicempl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/test2")
public class IndexController {
    @Autowired
    private RegisterServicempl registerService;

    @RequestMapping("getResult")
    public String home(String user){

        return registerService.getPassword(user);
//        registerService.getPassword("456")
    }
}
