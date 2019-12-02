package com.bnaqica.schoolstudent.service;

import com.bnaqica.schoolstudent.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
@Slf4j
public class StudentService {
    private Environment environment;

    public StudentService(Environment environment) {
        this.environment = environment;
    }

    public Student getStudentById(Long id) {
        return Student.builder()
                .id(id)
                .firstName("John")
                .middleName("Rock")
                .lastName("Thompson")
                .gender("Male")
                .dateOfBirth(LocalDate.of(2010, Month.NOVEMBER, 07))
                .studentMSport(environment.getProperty("local.server.port"))
                .build();
    }

}
