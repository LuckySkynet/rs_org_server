package com.alisn.rs.dto;

import com.alisn.rs.constant.ReqStatus;
import com.alisn.rs.util.Constant;

/**
 * Created by Septem on 2017/1/3.
 */
public class Result<T> {

    /**
     * 0=失败，1成功，默认成功
     */
    private ReqStatus state = ReqStatus.SUCCESS;
    //信息
    private String msg ="";

    private T data;

    public Result(){

    }

    public Result(int isSuccessed,T data){
        this.isSuccessed=isSuccessed;
        this.data=data;
    }

    public Result(int isSuccessed,String msg){
        this.isSuccessed=isSuccessed;
        this.msg=msg;
    }


}
