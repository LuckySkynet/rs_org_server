package com.alisn.rs.dto;

import com.alisn.rs.constant.ReqStatus;

/**
 * 返回信息
 */
public class Result<T,K> {

    // 0=失败，1成功，默认成功
    private String state = ReqStatus.SUCCESS.getStateInfo();
    //信息
    private String msg ="";

    private T data;

    public Result(){

    }

    public Result(String state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public Result(String state, T data) {
        this.state = state;
        this.data = data;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
