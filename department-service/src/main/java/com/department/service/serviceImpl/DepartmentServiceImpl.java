package com.department.service.serviceImpl;

import com.department.service.entity.Department;
import com.department.service.repository.DepartmentRepository;
import com.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment Department Service ");
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> findAllDepartment() {
        log.info("Inside findAllDepartment Department Service ");
        return departmentRepository.findAll();
    }

    @Override
    public Department findDepartmentById(Long id) {
        log.info("Inside findDepartmentById Department Service ");
        return departmentRepository.findById(id).get();
    }
}
