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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value = "/regist",method = RequestMethod.POST,produces = "application/json")
    public Result regist(@RequestBody User user) throws Exception {
        if (StringUtils.isBlank(user.getUserName())){
            return new Result(ReqStatus.FAIL.getStateInfo(),"账户名不能为空");
        }
        if (StringUtils.isBlank(user.getUserPasswd())){
            return new Result(ReqStatus.FAIL.getStateInfo(),"密码不能为空");
        }
        try{
            userService.regist(user);
        }catch (Exception e){
            logger.info(e.getMessage());
            return new Result(ReqStatus.FAIL.getStateInfo(),"唾骂出错了快改");
        }
        return new Result(ReqStatus.SUCCESS.getStateInfo(),userService.getUser(user.getUserName()));
    }


    @RequestMapping("/password")
    public Result password(User user,String newPasswd){
        if (StringUtils.isBlank(user.getUserName()+user.getUserPasswd()+newPasswd)){
            return new Result(ReqStatus.FAIL.getStateInfo(),"传入的信息不能有空");
        }

        try {
            userService.updatePassword(user,newPasswd);
        }catch (UserException e){
            logger.info(e.getMessage());
            return new Result(ReqStatus.FAIL.getStateInfo(),e.getMessage());
        } catch (Exception e) {
            logger.info(e.getMessage());
            return new Result(ReqStatus.FAIL.getStateInfo(),"修改密码时出现了错误");
        }

        return new Result();
    }

}
