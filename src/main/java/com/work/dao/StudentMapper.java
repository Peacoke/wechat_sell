package com.work.dao;

import com.work.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * StudentMapper 基于注解实现mybatissql操作
 *
 * @author peacoke
 * @date 2021/8/7
 */
@Component
@Mapper
public interface StudentMapper {

    @Select("select * from student where sid=#{sid}")
    @Results(id = "sid", value = {
            @Result(property = "sid", column = "sid", javaType = String.class),
            @Result(property = "sname", column = "sname", javaType = String.class),
            @Result(property = "sage", column = "sage", javaType = Date.class),
            @Result(property = "ssex", column = "ssex", javaType = String.class)}
    )
    Student queryStudentBySid(String sid);

    @Insert("insert into student(sid,sname,sage,ssex) values (#{sid},#{sname},#{sage},#{ssex})")
    int add();

    @Update("update student set sname=#{sname},sage=#{sage},ssex=#{ssex} where sid=#{sid}")
    int updateStudentBySid(Student student);


}
