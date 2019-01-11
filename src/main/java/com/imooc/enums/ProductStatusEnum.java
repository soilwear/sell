package com.imooc.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/11 11:37
 * Package_Name:com.imooc.enums
 * Description: 商品状态
 */

@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWW(1,"下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
