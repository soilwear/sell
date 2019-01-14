package com.imooc.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/14 20:01
 * Package_Name:com.imooc.enums
 * Description:
 */

@Getter
public enum  ResultEnum {


    PRODUCT_NOT_EXIST(10,"商品不存在"),
    ;


    private   Integer code;

    private   String  message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
