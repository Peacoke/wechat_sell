package com.work.conroller;

import com.work.bean.Course;
import com.work.bean.Student;
import com.work.bean.Teacher;
import com.work.dao.CourseDao;
import com.work.dao.StudentDao;
import com.work.dao.TeacherDao;
import com.work.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Peacoke on 2021/7/16.
 */
@Controller
@RequestMapping("/my")
public class MyBatisControllerTest {


    @Resource
    StudentDao studentDao;

    @Resource
    TeacherDao teacherDao;

    @Resource
    CourseDao courseDao;

    @GetMapping("/test")
    public String test() {

        System.out.println("enter test...");


        /*List<Student> students = studentDao.selectStudents();
        System.out.println(students.toString());*/


        /*List<Student> students1 = studentDao.selectScoresByStudent();
        System.out.println(students1.toString());*/

        List<Teacher> teachers = teacherDao.selectTeachers();
        //System.out.println("teachers:" + teachers);
        System.out.println("===================");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }


        /*List<Course> courses = courseDao.listCourse();
        for (Course cours : courses) {
            System.out.println(cours);
        }*/

        //System.out.println("courses:" + courses.toString());


        System.out.println("hello");
        return "yes";

    }

    @Resource
    StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "/stu", method = {RequestMethod.GET, RequestMethod.POST})
    public String testStudent(@RequestParam(value = "sid") String sid) {
        Student student = studentService.queryStudentBySid(sid);
        System.out.println(student.toString());

        Student student2 = studentService.queryStudentBySid(sid);
        System.out.println("student2:" + student2.toString());
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/update", method = {RequestMethod.GET, RequestMethod.POST})
    public String update(@RequestParam(value = "sid") String sid) {
        Student student = studentService.queryStudentBySid(sid);
        System.out.println(student.toString());

        student.setSname("Bob");

        Student student2 = studentService.update(student);
        System.out.println("student2:" + student2);
       /* Student student2 = studentService.queryStudentBySid(sid);
        System.out.println("student2:" + student2.toString());*/
        return "success";
    }


}
