package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/12 11:38
 * Package_Name:com.imooc.repository
 * Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;


    private   final   String OPENID="1100";



    @Test
    public void saveTest() {

        OrderMaster o = new OrderMaster();

        o.setOrderId("12345886");
        o.setBuyerName("兄弟");
        o.setBuyerPhone("110");
        o.setBuyerAddress("动物园");
        o.setBuyerOpenid(OPENID);
        o.setOrderAmount(new BigDecimal(2.5));

        OrderMaster result = repository.save(o);
        Assert.assertNotNull(result);


    }



    @Test
    public void findByBuyerOpenid() throws  Exception {


        PageRequest  request=new PageRequest(1,3);
        Page<OrderMaster>   result= repository.findByBuyerOpenid(OPENID,request);

        Assert.assertNotEquals(0,result.getTotalElements());

    }

    @Test
    public void findByBuyerOpenid1() {
    }
}