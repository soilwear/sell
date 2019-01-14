package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/11 11:25
 * Package_Name:com.imooc.service
 * Description:
 */
public interface ProductService {


    ProductInfo findOne(String producId);


    /**
     * 查询所有在架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();


    Page<ProductInfo> findAll(Pageable pageable);


    ProductInfo save(ProductInfo productInfo);


    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存

    void  decreaseStock(List<CartDTO> cartDTOList);

}
