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
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    /**
     * 登陆
     */
    @RequestMapping("/login")
    public Result login(){
        return new Result();
    }

    /**
     * 账号注册
     */
    @RequestMapping("/regist")
    public Result regist(@RequestBody User user){
        String msg;
        if (StringUtils.isBlank(user.getUserName())){
            msg="账户名不能为空";
            return new Result(Constant.status.FAIL.getState(),msg);
        }
        if (StringUtils.isBlank(user.getUserPasswd())){
            msg="密码不能为空";
            return new Result(Constant.status.FAIL.getState(),msg);
        }

        try{
            userService.regist(user);
        }catch (Exception e){
            logger.info(e.getMessage());
            msg="唾骂出错了快改";
            return new Result(Constant.status.FAIL.getState(),msg);
        }

        return new Result();
    }


    @RequestMapping("/password")
    public Result password(User user){
        //判断旧密码是否正确


        return new Result();
    }

}
