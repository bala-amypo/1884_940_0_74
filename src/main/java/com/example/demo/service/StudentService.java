package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getbyid(int id);

    Student updatedata(int id, Student student);

    Student deletedata(int id);
}
