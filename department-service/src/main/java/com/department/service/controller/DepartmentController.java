package com.department.service.controller;

import com.department.service.entity.Department;
import com.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment Department controller ");
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> findAllDepartments() {
        log.info("Inside findAllDepartments Department controller ");
        return departmentService.findAllDepartment();
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable(name = "id") Long id) {
        log.info("Inside findDepartmentById Department controller ");
        return departmentService.findDepartmentById(id);
    }
}
