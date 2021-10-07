package com.department.service.service;

import com.department.service.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> findAllDepartment();

    Department findDepartmentById(Long id);
}
