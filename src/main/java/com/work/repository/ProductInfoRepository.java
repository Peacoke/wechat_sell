package com.work.repository;

import com.work.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Peacoke on 2018/7/28.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{

    ProductInfo findProductInfoByProductId(String productId);

}
