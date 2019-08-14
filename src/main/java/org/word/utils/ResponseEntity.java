package org.word.utils;

import lombok.Data;

//Ajax请求响应对象的类
@Data
public class ResponseEntity<T>{

    private String code;

    private String message;

    private String successCode = "1";

    private String errorCode = "-1";

    private T data;//返回到前台对象

    public static final ResponseEntity SUCCESS = new ResponseEntity("1", "success", null);

    public static final ResponseEntity ERROR = new ResponseEntity("-1", "error", null);

    public ResponseEntity() {
    }

    public ResponseEntity(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseEntity<T> buildSuccess(String message, T data) {
        this.code = successCode;
        this.message = message;
        this.data = data;
        return this;

    }

    public ResponseEntity<T> buildError(String message, T data) {
        this.code = errorCode;
        this.message = message;
        this.data = data;
        return this;
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

    public T getData() {
        return data;
    }



}
