package com.wuniu.hospital_web.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultResponse<T> {
    private int code ;
    private String msg ;
    private T data ;
    private String token ; // 保存jwt 生成的token

    public ResultResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
