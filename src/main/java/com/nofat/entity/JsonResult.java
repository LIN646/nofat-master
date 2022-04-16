package com.nofat.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by xsir on 2020/5/19.
 *
 * @author xsir
 * @date 2020/5/19
 */
public class JsonResult<T> implements Serializable{
    private boolean success;
    private String msg;
    private T data;

    public JsonResult() {

    }

    public JsonResult(boolean success, String msg, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }


    public void fail() {
        this.success = false;
        this.msg = "request: failed";
        this.data = null;
    }

    public void fail(String msg) {
        this.success = false;
        this.msg = msg;
        this.data = null;
    }

    public void ok() {
        this.success = true;
        this.msg = "request: ok";
        this.data = null;
    }

    public void ok(T data) {
        this.success = true;
        this.msg = "request: ok";
        this.data = data;
    }

    public void ok(String msg, T data) {
        this.success = true;
        this.msg = msg;
        this.data = data;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
