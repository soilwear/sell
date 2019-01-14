package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/14 19:59
 * Package_Name:com.imooc.exception
 * Description:
 */
public class SellException  extends  RuntimeException {




    private   Integer code;

    public SellException(ResultEnum resultEnum) {

        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }
}
