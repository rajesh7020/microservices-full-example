package com.rajesh.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/studentServiceFallBack")
    public String studentServiceFallBackMethod() {
        return "Student Service is taking longer than expected." +
                " Please try again later.....";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking longer than expected." +
                " Please try again later.....";
    }
}
