package com.hkp.springcloude.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author: hkp
 * @create: 2021/06/26/13:42
 * @Description: 工具类封装服务返回结果
 * @Param:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> {

    private Integer code;//返回状态码
    private String message;//返回是否调用成功
    private T data; //返回的数据

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
