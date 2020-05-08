package com.css.demo.constants;

public enum ErrorConstants {
    SUCCESS("0000","成功"),
    FAILED("1111","失败"),
    SYSTEM_ERROR("04-4-001","系统异常"),
    LIST_NULL("LIST_NULL","list集合为空");



    private String code ;
    private String msg ;

    private ErrorConstants(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static ErrorConstants getByIndex(String code){
        if(null==code){
            return null;
        }else{
            ErrorConstants[] var1 = values();
            int var2 = var1.length ;

            for(int var3 = 0 ; var3<var2 ; ++var3){
                ErrorConstants errorConstants = var1[var3];
                if(errorConstants.getCode().equals(code)){
                    return errorConstants ;
                }
            }
            return null ;
        }
    }

    public String toString(){return this.getMsg();}
}
