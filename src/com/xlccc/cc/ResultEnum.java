package com.xlccc.cc;

/**
 * @author Linker
 * @date 2020/11/9 18:01
 * @description：ResultOfReturn
 */
public enum ResultEnum {
    success(0, "success"),
    fail(1, "fail");
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
