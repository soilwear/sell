package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: soil
 * Date: 2019/1/9 20:59
 * Package_Name:com.imooc.service.impl
 * Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private   CategoryServiceImpl  categoryService;


    @Test
    public void findOne() {


        ProductCategory  productCategory=categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());


    }

    @Test
    public void findAll() {

        List  <ProductCategory> productCategories  =categoryService.findAll();
        Assert.assertNotEquals(0,productCategories.size());
    }

    @Test
    public void findByCategoryTypeIn()  throws   Exception{

        List<ProductCategory> productCategories  =categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3));
        Assert.assertNotEquals(0,productCategories.size());

    }

    @Test
    public void save() throws  Exception {
    ProductCategory  productCategory=new ProductCategory("撒旦",20);
     ProductCategory  result=  categoryService.save(productCategory);
     Assert.assertNotNull(result);

    }
}