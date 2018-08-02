package com.work.conroller;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URLEncoder;

/**
 * Created by Peacoke on 2018/7/29.
 */
@Controller
@RequestMapping("/wechat")
public class WechatController {
    @Autowired
    private WxMpService wxMpService;

    @GetMapping("/authorize")
    public String authorize(@RequestParam("returnUrl")String returnUrl){
        //1.配置
        //2.调用方法
        String url = "http://peacoke.nat300.top/sell/wechat/userinfo";
        System.out.println("returnUrl："+returnUrl);
        String redirect = wxMpService.oauth2buildAuthorizationUrl(url,WxConsts.OAuth2Scope.SNSAPI_BASE, URLEncoder.encode(returnUrl));
        System.out.println("网页授权获取code："+redirect);
        return "redirect:"+redirect;
    }

    @GetMapping("/userInfo")
    public String userInfo(@RequestParam("code")String code,@RequestParam("state")String returnUrl) throws Exception {
        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = new WxMpOAuth2AccessToken();
        try {
            wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);

        } catch (WxErrorException e) {
            e.printStackTrace();
            throw new Exception(e.toString());
        }
        String openId = wxMpOAuth2AccessToken.getOpenId();
        System.out.println("openId："+openId);

        return "redirect:"+returnUrl+"?openid="+openId;
    }
}
