package com.alisn.rs.controller;

import com.alisn.rs.dto.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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
    public Result regist(){
        return new Result();
    }


    @RequestMapping("/password")
    public Result password(){
        return new Result();
    }

}
