package com.nofat.controller;

import com.nofat.entity.JsonResult;
import com.nofat.utils.WeChatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

/**
 * Created by xsir on 2020/5/19.
 *
 * @author xsir
 * @date 2020/5/19
 */
@Controller
@RequestMapping("/login")
public class Login {
    @Autowired
    private WeChatUtil weChat;

    @RequestMapping("/byWx")
    @ResponseBody
    public JsonResult byWx(@RequestParam("code") String code) {
        System.out.println("code: " + code);

        String appid = weChat.getAppId();
        String secret = weChat.getAppSecret();
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=" +
                appid + "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";

        System.out.println("requestUrl: " + requestUrl);

        String result = weChat.request(requestUrl, "GET");

        System.out.println("result: " + result);


        JsonResult result1 = new JsonResult();
        result1.ok();

        return result1;
    }
}
