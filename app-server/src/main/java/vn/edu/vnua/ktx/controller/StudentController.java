package vn.edu.vnua.ktx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import vn.edu.vnua.ktx.model.Student;
import vn.edu.vnua.ktx.repository.StudentRepository;

public class StudentController {
    
    @Autowired
    private StudentRepository studentRepository;
}
