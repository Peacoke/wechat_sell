package com.work.repository;

import com.work.pojo.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Peacoke on 2018/7/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findProductInfoByProductId() throws Exception {
        ProductInfo productInfo = repository.findProductInfoByProductId("123");
    }

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1001");
        productInfo.setProductName("王老吉");
        productInfo.setProductDesc("怕上火喝王老吉");
        productInfo.setProductPrice(new BigDecimal(4.5));
        productInfo.setCategoryType(11);
        productInfo.setProductIcon("nice");
        productInfo.setProductStock(999);
        repository.save(productInfo);
    }

}