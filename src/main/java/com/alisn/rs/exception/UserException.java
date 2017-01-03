package com.alisn.rs.exception;

/**
 * Created by Skynet on 2017/1/1 12:19.
 *
 * 定义用户异常
 */
public class UserException extends RuntimeException {
    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
