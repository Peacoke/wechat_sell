package com.work.service;

import com.work.bean.Student;
import com.work.dao.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author peacoke
 * @date 2021/8/7
 */
@Service
//@Repository("studentService")
public class StudentService implements StudentInterface{

    @Resource
    StudentMapper studentMapper;

    @Override
    public Student queryStudentBySid(String sid) {
        return studentMapper.queryStudentBySid(sid);
    }

    @Override
    public Student update(Student student) {
        studentMapper.updateStudentBySid(student);
        return studentMapper.queryStudentBySid(student.getSid());
    }


}
