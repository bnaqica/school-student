package com.bnaqica.schoolstudent.service;

import com.bnaqica.schoolstudent.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {

    public Student getStudentById(Long id) {
        return Student.builder()
                .id(id)
                .firstName("John")
                .middleName("Rock")
                .lastName("Thompson")
                .gender("Male")
                .dateOfBirth(LocalDate.of(2010, Month.NOVEMBER, 07))
                .build();
    }

}
