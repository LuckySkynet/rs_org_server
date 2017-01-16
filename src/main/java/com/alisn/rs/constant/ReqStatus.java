package com.alisn.rs.constant;

/**
 *  请求状态
 */
public enum ReqStatus {

    SUCCESS(1,"success"),
    FAIL(0,"fail");

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
