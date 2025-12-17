package com.example.aiml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Student stu) {
        return studentService.postdata(stu);
    }

    @GetMapping("/getdata")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getdata/{id}")
    public StudentDetail getbyid(@PathVariable int id) {
        return stuser.getbyid(id);
    }

    @PutMapping("/updatedata/{id}")
    public StudentDetail updatedata(@PathVariable int id,@RequestBody StudentDetail stu) {
        return stuser.updatedata(id,stu);
    }

    @DeleteMapping("/deletedata/{id}")
    public StudentDetail deletedata(@PathVariable int id) {
        return stuser.deletedata(id);
    }
}
