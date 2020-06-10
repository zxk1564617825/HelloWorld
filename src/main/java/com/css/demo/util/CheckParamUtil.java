package com.css.demo.util;

import com.css.demo.exception.BusinessRuntimeException;
import org.springframework.validation.BindingResult;

/**
 * @ClassName CheckParamUtil
 * @Description 类描述
 * @Author 风住尘
 * @Date 2020/5/16 13:14
 **/
public class CheckParamUtil {
    public CheckParamUtil() {

    }

    public static void getCheckResult(BindingResult bindingResult, Class enumClass) throws BusinessRuntimeException {
        if (bindingResult.hasErrors()) {
            CodeEnum errorEnumClass = getEnumByStateValue(bindingResult.getFieldError().getDefaultMessage(), enumClass);
            throw new BusinessRuntimeException(errorEnumClass.getCode(), errorEnumClass.getMsg());
        }
    }

    private static <T extends CodeEnum> T getEnumByStateValue(String stateValue, Class<T> enumClass) {
        CodeEnum[] var2 = (CodeEnum[]) enumClass.getEnumConstants();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            T t = (T) var2[var4];
            if (t.getCode().equals(stateValue)) {
                return t;
            }
        }
        return null;
    }
}
