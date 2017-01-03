package com.alisn.rs.exception;

/**
 * Created by Skynet on 2017/1/1 12:19.
 *
 * 定义用户未找到异常
 */
public class UserNotFoundException extends UserException {
    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
