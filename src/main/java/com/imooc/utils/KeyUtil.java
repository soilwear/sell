package com.imooc.utils;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/14 20:24
 * Package_Name:com.imooc.utils
 * Description:
 */
public class KeyUtil {


    /**
     * 生成唯一的主键
     * 格式 :时间+随机数
     *
     * @return
     */
    //多线程加上  synchronized
    public static   synchronized String genUniqueKey() {
        Random random = new Random();
        System.currentTimeMillis();

        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);




    }
}
