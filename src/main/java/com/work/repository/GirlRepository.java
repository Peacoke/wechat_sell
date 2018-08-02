package com.work.repository;

import com.work.pojo.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Peacoke on 2018/7/15.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{

    //通过年龄来查询
    public List<Girl> findByAge(Integer age);
}
