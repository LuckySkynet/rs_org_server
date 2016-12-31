package com.alisn.rs.domain;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_INFO.USER_ID
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_INFO.USER_NAME
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_INFO.USER_PASSWD
     *
     * @mbggenerated
     */
    private String userPasswd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_INFO.USER_ID
     *
     * @return the value of USER_INFO.USER_ID
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_INFO.USER_ID
     *
     * @param userId the value for USER_INFO.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_INFO.USER_NAME
     *
     * @return the value of USER_INFO.USER_NAME
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_INFO.USER_NAME
     *
     * @param userName the value for USER_INFO.USER_NAME
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_INFO.USER_PASSWD
     *
     * @return the value of USER_INFO.USER_PASSWD
     *
     * @mbggenerated
     */
    public String getUserPasswd() {
        return userPasswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_INFO.USER_PASSWD
     *
     * @param userPasswd the value for USER_INFO.USER_PASSWD
     *
     * @mbggenerated
     */
    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd == null ? null : userPasswd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_INFO.CREATE_TIME
     *
     * @return the value of USER_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_INFO.CREATE_TIME
     *
     * @param createTime the value for USER_INFO.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}