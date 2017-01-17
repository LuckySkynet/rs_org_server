package com.alisn.rs.dto;

import com.alisn.rs.constant.ReqStatus;

/**
 * 返回信息
 */
public class Result<T> {

    // 0:失败，1:成功，默认成功
    private String stateInfo = ReqStatus.SUCCESS.getStateInfo();
    //信息
    private String msg ="";

    private T data;

    public Result(){

    }

    public Result(String stateInfo, String msg) {
        this.stateInfo = stateInfo;
        this.msg = msg;
    }

    public Result(String stateInfo, T data) {
        this.stateInfo = stateInfo;
        this.data = data;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
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
