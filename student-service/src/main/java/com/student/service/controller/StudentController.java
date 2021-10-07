package com.student.service.controller;

import com.student.service.entity.Student;
import com.student.service.responseDTO.StudentDto;
import com.student.service.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        log.info("Inside saveStudent Student Service ");
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public StudentDto findStudentById(@PathVariable("id") Long id) {
        log.info("Inside findStudentById Student Service ");
        return studentService.findStudentById(id);
    }
}
