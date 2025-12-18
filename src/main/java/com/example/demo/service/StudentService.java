package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService{
    Map<Integer, Student> details = new HashMap<>();
    Student saveStudent(Student student);

    public List<Student> getAllStudents() {
        return new ArrayList<>(details.values());
    }

    public Student getbyid(int id) {
        return details.get(id);
    }

    public Student updatedata(int id, Student stu) {
        details.replace(id,stu);
        return details.get(id);
    }

    public Student deletedata(int id) {
        details.remove(id);
        return details.get(id);
    }

}

