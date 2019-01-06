package com.sqlhero.common.dto;

/**
 * @author ：sqlhero.
 * @date ：Created in 11:23 2018/12/3
 * @description ：dto
 * @modified By：
 * @version: 0.0.1
 */
import java.io.Serializable;

public class RespDTO<T> implements Serializable{
    public int code = 0;
    public String error = "";
    public T data;

    public static RespDTO onSuc(Object data) {
        RespDTO resp = new RespDTO();
        resp.data = data;
        return resp;
    }

    @Override
    public String toString() {
        return "RespDTO{" +
                "code=" + code +
                ", error='" + error + '\'' +
                ", data=" + data +
                '}';
    }
}
