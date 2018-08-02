package com.work.repository;

import com.work.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Peacoke on 2018/7/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {

       /* ProductCategory productCategorys = repository.findProductCategoryByCategoryId(8);
        System.out.println("productCategorys:" + productCategorys.toString());*/
       List<ProductCategory> list = repository.findAll();
       System.out.println("list:"+list.size());

    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(4);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeList() {
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        for (ProductCategory productCategory : result) {
            System.out.println(productCategory.toString());
        }
        Assert.assertNotEquals(0, result.size());
    }

}