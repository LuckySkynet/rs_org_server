package com.alisn.rs.dto;

import com.alisn.rs.util.Constant;

/**
 * Created by Septem on 2017/1/3.
 */
public class Result<T> {

    /**
     * 0=失败，1成功，默认成功
     */
    private int isSuccessed= Constant.status.SUCCESS.getState();
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

    public int getIsSuccessed() {
        return isSuccessed;
    }

    public void setIsSuccessed(int isSuccessed) {
        this.isSuccessed = isSuccessed;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
