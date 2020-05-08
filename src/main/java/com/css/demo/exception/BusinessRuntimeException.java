package com.css.demo.exception;

import com.css.demo.constants.ErrorConstants;

/**
 * @ClassName BusinessRuntimeException
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/7 16:04
 **/
public class BusinessRuntimeException extends RuntimeException {
    private final String code ;
    private final String message ;

    public BusinessRuntimeException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessRuntimeException(String message){this(ErrorConstants.FAILED.getCode(),message);};

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
