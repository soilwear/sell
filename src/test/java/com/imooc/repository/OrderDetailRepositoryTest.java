package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/12 15:49
 * Package_Name:com.imooc.repository
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {


    @Autowired

    private OrderDetailRepository repository;


    @Test
    public void saveTest() {

        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setDetailId("1234");
        orderDetail.setOrderId("11111");
        orderDetail.setProductIcon("http");
        orderDetail.setProductId("13430");

        orderDetail.setProductName("凳子");
        orderDetail.setProductPrice(new BigDecimal(1.2));
        orderDetail.setProductQuantity(2);


        OrderDetail   result= repository.save(orderDetail);

        Assert.assertNotNull(result);
    }


    @Test
    public void findByOrderId() {


        List<OrderDetail>  orderDetailList=repository.findByOrderId("11111");


        Assert.assertNotEquals(0,orderDetailList.size());
    }
}