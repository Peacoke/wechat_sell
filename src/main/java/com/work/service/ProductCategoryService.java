package com.work.service;

import com.work.pojo.ProductCategory;

import java.util.List;

/**
 * Created by Peacoke on 2018/7/28.
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTyeList);

    ProductCategory save(ProductCategory productCategory);
}
