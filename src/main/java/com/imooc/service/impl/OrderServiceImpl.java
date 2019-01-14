package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.OrderDto;
import com.imooc.service.OrderService;
import com.imooc.service.ProductService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/14 19:50
 * Package_Name:com.imooc.service.impl
 * Description:
 */

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private ProductService productService;

    @Override
    public OrderDto create(OrderDto orderDto) {

        //1 。查询商品，（数量，价格）
        for (OrderDetail orderDetail : orderDto.getOrderDetailList()) {


            ProductInfo productInfo = productService.findOne(orderDetail.getProductId());

       if (productInfo==null){
throw   new


       }

        }
        //2 .计算总价

        //3 .写入订单·数据库,(orderMaster和orderDetail)

        //4 .扣库存

        return null;
    }

    @Override
    public Order findTime(String orderId) {
        return null;
    }

    @Override
    public Page<OrderDto> findList(String buyerOpenId, Pageable pageable) {
        return null;
    }

    @Override
    public OrderDto cancel(OrderDto orderDto) {
        return null;
    }

    @Override
    public OrderDto finish(OrderDto orderDto) {
        return null;
    }

    @Override
    public OrderDto paid(OrderDto orderDto) {
        return null;
    }
}
