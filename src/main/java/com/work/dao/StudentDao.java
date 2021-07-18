package com.work.dao;

import com.work.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Peacoke on 2021/7/16.
 */
@Mapper
public interface StudentDao {

    public List<Student> selectStudents();

    public List<Student> selectScoresByStudent();

}
