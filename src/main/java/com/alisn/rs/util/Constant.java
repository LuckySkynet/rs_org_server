package com.alisn.rs.util;

/**
 * 存放常量
 */
public  class Constant {


    public enum status{
        SUCCESS(1,"成功"),
        FAIL(0,"失败");

        public final int state;
        public final String stateInfo;

        status(int state,String stateInfo){
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
}
