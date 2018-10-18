package com.example.demo.freemarkerTest.controller;

import com.example.demo.freemarkerTest.entity.Class;
import com.example.demo.freemarkerTest.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lk on 2018/10/18.
 */
@Controller
public class FreemarkerTestController {
    @RequestMapping("/ft")
    public String freemarkerTest(ModelMap map){
        List<Class> classList=new ArrayList<>();
        for(int i=0;i<3;i++){
            Class c=new Class();
            c.setName("cls-"+i);
            List<Student> studentList=new ArrayList<>();
            for(int j=0;j<3;j++){
                Student s=new Student();
                s.setName("stu-"+i+"-"+j);
                s.setAge(i+j);
                studentList.add(s);
            }
            c.setStudentList(studentList);
            classList.add(c);
        }
        map.put("cls",classList);
        return "/test";
    }
}
