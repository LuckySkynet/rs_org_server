package com.alisn.rs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA User: Sky-Net Date: 2017/1/3
 */
@RestController
@RequestMapping("/captcha")
public class CaptchaController {

    /**
     * 获取验证码
     */
    @RequestMapping(value = "/*",method = RequestMethod.GET)
    public void getKaptchaImage(HttpServletRequest request, HttpServletResponse response){

    }
}
