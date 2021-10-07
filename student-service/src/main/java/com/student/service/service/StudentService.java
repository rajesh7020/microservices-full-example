package com.student.service.service;

import com.student.service.entity.Student;
import com.student.service.responseDTO.StudentDto;

public interface StudentService {

    Student saveStudent(Student student);

    StudentDto findStudentById(Long id);
}
