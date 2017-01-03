package com.alisn.rs.controller;

import com.alisn.rs.service.UserCaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA User: Sky-Net Date: 2017/1/3
 */
@RestController
public class CaptchaController {

    private final UserCaptchaService userCaptchaService;

    @Autowired
    public CaptchaController(UserCaptchaService userCaptchaService) {
        this.userCaptchaService = userCaptchaService;
    }

    /**
     * 获取验证码
     */
    @RequestMapping(value = "/captcha", method = RequestMethod.GET)
    public void getKaptchaImage(HttpServletRequest request, HttpServletResponse response) {
        userCaptchaService.getKaptchaImage(request, response);
    }

}
