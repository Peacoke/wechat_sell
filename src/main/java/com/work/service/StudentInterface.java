package com.work.service;

import com.work.bean.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author peacoke
 * @date 2021/8/11
 */
@CacheConfig(cacheNames = "student")
@Component
public interface StudentInterface {

    @Cacheable(key="#p0")
    Student queryStudentBySid(String sid);

    @CachePut(key = "#p0.sid")
    Student update(Student student);

}
