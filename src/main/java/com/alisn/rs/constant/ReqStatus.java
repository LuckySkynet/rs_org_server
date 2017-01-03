package com.alisn.rs.constant;

/**
 *  请求状态
 */
public enum ReqStatus implements BaseStatus{

    SUCCESS(1,"成功"),
    FAIL(2,"失败");

    private final int state;
    private final String stateInfo;

    ReqStatus(int state, String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
