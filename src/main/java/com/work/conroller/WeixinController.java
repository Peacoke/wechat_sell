package com.work.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Peacoke on 2018/7/29.
 */
@RestController
@RequestMapping("/weixin")
public class WeixinController {

    @GetMapping("/auth")
    public void auth(){
        System.out.println("进入auth方法。。。");
        //System.out.println("code:"+code);
    }

}
