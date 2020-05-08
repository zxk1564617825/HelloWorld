package com.css.demo.constants;

public enum ResultConStantEnum {
    SUCCESS("000000","成功"),
    FAILED("111111","失败"),
    RUNTINEFAILED("03-4-500","运行时异常"),
    SYSTEM_ERROR("04-4-001","系统异常");

    private String code ;
    private String msg ;

    ResultConStantEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return this.getMsg();
    }

    public static ResultConStantEnum getByIndex(String code){
        if(null==code){
            return null ;
        }
        for(ResultConStantEnum resultConStantEnum : values()){
            if(resultConStantEnum.getCode().equals(code)){
                return resultConStantEnum ;
            }
        }
        return null ;
    }
}
