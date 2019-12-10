package com.garen.domain;

import java.util.List;

/**
 *  接口返回基类
 */
public class BaseResult<T> {

    private int result;
    private String detail;
    private List<T> data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "result=" + result +
                ", detail='" + detail + '\'' +
                ", data=" + data +
                '}';
    }
}
