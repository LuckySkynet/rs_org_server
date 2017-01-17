package com.alisn.rs.controller;

import com.alisn.rs.constant.ReqStatus;
import com.alisn.rs.dto.Result;
import com.alisn.rs.entity.User;
import com.alisn.rs.exception.UserException;
import com.alisn.rs.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     * 用户登录
     */
    @RequestMapping("/login")
    public Result login() {
        return new Result();
    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/regist", method = RequestMethod.POST, produces = "application/json")
    public Result regist(@RequestBody User user) throws Exception {
        if (StringUtils.isBlank(user.getUserName())) {
            return new Result(ReqStatus.FAIL.getStateInfo(), "账户名不能为空");
        }
        if (StringUtils.isBlank(user.getUserPasswd())) {
            return new Result(ReqStatus.FAIL.getStateInfo(), "密码不能为空");
        }
        try {
            userService.regist(user);
        } catch (Exception e) {
            logger.info(e.getMessage());
            return new Result(ReqStatus.FAIL.getStateInfo(), e.getMessage());
        }
        return new Result(ReqStatus.SUCCESS.getStateInfo(), userService.getUser(user.getUserName()));
    }


    @RequestMapping("/password")
    public Result password(User user, String newPasswd) {
        if (StringUtils.isBlank(user.getUserName() + user.getUserPasswd() + newPasswd)) {
            return new Result(ReqStatus.FAIL.getStateInfo(), "传入的信息不能有空");
        }

        try {
            userService.updatePassword(user, newPasswd);
        } catch (UserException e) {
            logger.info(e.getMessage());
            return new Result(ReqStatus.FAIL.getStateInfo(), e.getMessage());
        } catch (Exception e) {
            logger.info(e.getMessage());
            return new Result(ReqStatus.FAIL.getStateInfo(), "修改密码时出现了错误");
        }

        return new Result();
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET, produces = "application/json")
    public Result getUserByName(@PathVariable("userName") String userName) {
        try {
            String exist = "exist";
            User user = userService.getUser(userName);
            if(user == null){
                exist = "notExist";
            }
            return new Result(ReqStatus.SUCCESS.getStateInfo(),exist);
        } catch (Exception e) {
            logger.info(e.getMessage());
            return new Result(ReqStatus.FAIL.getStateInfo(), e.getMessage());
        }
    }

}
