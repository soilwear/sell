package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/9 20:48
 * Package_Name:com.imooc.service
 * Description:
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();


    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
