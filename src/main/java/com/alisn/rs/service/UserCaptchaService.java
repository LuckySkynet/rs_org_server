package com.alisn.rs.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA User: Sky-Net Date: 2017/1/3
 */
public interface UserCaptchaService {
    /**
     * 获取验证码图片
     */
    void getKaptchaImage(HttpServletRequest request, HttpServletResponse response);
}
