package com.imooc.utils;

import com.imooc.vo.ResultVO;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/11 20:55
 * Package_Name:com.imooc.utils
 * Description:
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
