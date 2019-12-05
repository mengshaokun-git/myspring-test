//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.springtest.utils;


public final class ServerResponse<T> {
    private int code;
    private String message;
    private T data;
    public static ServerResponse SUCCESS = new ServerResponse();

    public ServerResponse() {
    }

    public boolean success() {
        return this.code == 0;
    }

    public static <T> ServerResponse<T> success(T t) {
        ServerResponse<T> r = new ServerResponse();
        r.code = 0;
        r.data = t;
        return r;
    }

    public static <T> ServerResponse<T> success(T t, String message) {
        ServerResponse<T> r = new ServerResponse();
        r.code = 0;
        r.message = message;
        r.data = t;
        return r;
    }

    public static ServerResponse fail(String message) {
        return fail(500, message, (Object)null);
    }

    public static ServerResponse fail(int code, String message) {
        return fail(code, message, (Object)null);
    }

    public static <T> ServerResponse<T> fail(int code, String message, T data) {
        ServerResponse errorResponse = new ServerResponse();
        errorResponse.setCode(code);
        errorResponse.setMessage(message);
        errorResponse.setData(data);
        return errorResponse;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    static {
        SUCCESS.setCode(0);
    }
}
