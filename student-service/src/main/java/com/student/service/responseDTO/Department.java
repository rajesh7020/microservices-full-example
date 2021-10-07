package com.student.service.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data
class Department {

    private Long id;

    private String deptName;

    private String deptCode;
}
