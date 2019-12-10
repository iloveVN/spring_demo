package com.garen.domain;

/**
 * 查询条件的基类
 */
public class BaseQueryVo<T> {

    private BaseQuery baseQuery;
    private T data;

    public BaseQueryVo(BaseQuery baseQuery, T data) {
        this.baseQuery = baseQuery;
        this.data = data;
    }

    public BaseQueryVo() {
    }

    public BaseQuery getBaseQuery() {
        return baseQuery;
    }

    public void setBaseQuery(BaseQuery baseQuery) {
        this.baseQuery = baseQuery;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseQueryVo{" +
                "baseQuery=" + baseQuery +
                ", data=" + data +
                '}';
    }
}
