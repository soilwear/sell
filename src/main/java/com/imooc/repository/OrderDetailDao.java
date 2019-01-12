package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/12 10:23
 * Package_Name:com.imooc.repository
 * Description:  订单详情
 */
public interface OrderDetailDao  extends JpaRepository<OrderDetail ,String> {


    List<OrderDetail>  finByOrderId(String  orderId, Pageable pageable);


}
