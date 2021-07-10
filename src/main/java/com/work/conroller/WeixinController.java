package com.work.conroller;

import com.work.service.GirlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @Resource
    GirlService girlService;

    @GetMapping("/insert")
    public void insert(){
        System.out.println("进入auth方法。。。");
        //System.out.println("code:"+code);
        girlService.insertTwo();

    }



}
