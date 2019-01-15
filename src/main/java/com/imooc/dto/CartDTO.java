package com.imooc.dto;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/14 20:40
 * Package_Name:com.imooc.dto
 * Description:  购物车
 */

@Data
public class CartDTO {


    //商品Id
    private String productId;

    //数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
