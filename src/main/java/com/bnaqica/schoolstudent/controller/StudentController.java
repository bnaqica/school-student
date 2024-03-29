package com.bnaqica.schoolstudent.controller;

import com.bnaqica.schoolstudent.model.Student;
import com.bnaqica.schoolstudent.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id) {
        log.info("getStudentById called with id {}", id);

        return studentService.getStudentById(id);
    }

}
