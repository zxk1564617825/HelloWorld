package com.css.demo.util;

import com.css.demo.constants.ResultConStantEnum;

/**
 * @ClassName CallRespose
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/7 14:57
 **/
public class CallRespose<T> {
    private String code ;
    private String message ;
    private T result ;

    public CallRespose(String code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public CallRespose(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public CallRespose() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public static <T> CallRespose<T> success(T result){
        return new CallRespose<>(ResultConStantEnum.SUCCESS.getCode(),ResultConStantEnum.SUCCESS.getMsg(),result);
    }

    public static <T> CallRespose<T> error(String code,String message){
        return new CallRespose<>(code,message);
    }

    public static <T> CallRespose<T> error(String message){
        return new CallRespose<>(ResultConStantEnum.FAILED.getCode(),message);
    }

    @Override
    public String toString() {
        return "CallRespose [" +
                "code=" + code  +
                ", message=" + message  +
                ", result=" + result +
                "]";
    }
}
