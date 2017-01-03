package com.alisn.rs.controller;

import com.alisn.rs.dto.Result;
import com.alisn.rs.entity.User;
import com.alisn.rs.service.UserService;
import com.alisn.rs.util.Constant;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    /**
     * 登陆
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = {"text/json"})
    public Result login(@RequestBody User user,
                        HttpServletRequest request, HttpServletResponse response) {
        //判断User是否为空，若不为空，则为首次登录；若为空，则从Cookies  中查找是否存在name为user的cookie
        String msg;
        Cookie cookie = null;
        try {
            Integer count = userService.login(user);
            if (count < 0) {
                msg = "用户名或密码错误";
                return new Result(Constant.status.FAIL.getState(), msg);
            } else {
                msg = "登录成功";
                cookie = new Cookie(user.getUserName(), user.getUserPasswd());
                //设置Cookie的存储时间，以秒为单位
                cookie.setMaxAge(60 * 10);
                //将Cookie传给客户端
                response.addCookie(cookie);
                return new Result(Constant.status.SUCCESS.getState(), msg);
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
            msg = "唾骂出错了快改";
            return new Result(Constant.status.FAIL.getState(), msg);
        }
    }

    /**
     * 账号注册
     */
    @RequestMapping("/regist")
    public Result regist(@RequestBody User user) {
        String msg;
        if (StringUtils.isBlank(user.getUserName())) {
            msg = "账户名不能为空";
            return new Result(Constant.status.FAIL.getState(), msg);
        }
        if (StringUtils.isBlank(user.getUserPasswd())) {
            msg = "密码不能为空";
            return new Result(Constant.status.FAIL.getState(), msg);
        }

        try {
            userService.regist(user);
        } catch (Exception e) {
            logger.info(e.getMessage());
            msg = "唾骂出错了快改";
            return new Result(Constant.status.FAIL.getState(), msg);
        }

        return new Result();
    }


    @RequestMapping("/password")
    public Result password() {

        return new Result();
    }

}
