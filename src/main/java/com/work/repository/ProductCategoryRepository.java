package com.work.repository;

import com.work.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Peacoke on 2018/7/24.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{
    ProductCategory findProductCategoryByCategoryId(Integer categoryId);
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
