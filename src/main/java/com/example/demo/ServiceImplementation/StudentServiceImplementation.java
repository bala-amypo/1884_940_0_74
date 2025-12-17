package com.example.demo.ServiceImplementation;

import org.springframework.stereotype.Service;

import org.
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService{

    // private final StudentRepository StudentRepository;
    // public StudentServiceImplementation(StudentRepository studentRepository){
    //     this.studentRepository=studentRepository;
    // }

    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}