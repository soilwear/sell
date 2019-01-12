package com.imooc.enums;

import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/12 10:03
 * Package_Name:com.imooc.enums
 * Description:  订单状态
 */

@Getter
public enum OrderStatusEnum {


    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
