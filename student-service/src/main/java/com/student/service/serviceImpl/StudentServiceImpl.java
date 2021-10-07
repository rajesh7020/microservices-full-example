package com.student.service.serviceImpl;

import com.student.service.entity.Student;
import com.student.service.repository.StudentRepository;
import com.student.service.responseDTO.Department;
import com.student.service.responseDTO.StudentDto;
import com.student.service.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Student saveStudent(Student student) {
        log.info("Inside saveStudent Student Service ");
        return studentRepository.save(student);
    }

    @Override
    public StudentDto findStudentById(Long id) {
        log.info("Inside saveStudent Student Service ");
        Student student = studentRepository.findById(id).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + student.getDepartmentId(), Department.class);
        return new StudentDto(student, department);
    }
}
