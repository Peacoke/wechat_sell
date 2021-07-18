package com.work.dao;

import com.work.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Peacoke on 2021/7/17.
 */
@Mapper
public interface TeacherDao {

    /*public List<Teacher> listTeachers();*/

    public List<Teacher> selectTeachers();

}
