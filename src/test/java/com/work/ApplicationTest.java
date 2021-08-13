package com.work;

import com.work.bean.Student;
import com.work.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author peacoke
 * @date 2021/8/11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void test() {
        Student student = studentService.queryStudentBySid("01");
        System.out.println("student:" + student.toString());

        Student student2 = studentService.queryStudentBySid("01");
        System.out.println("student2:" + student2.toString());
    }


}
