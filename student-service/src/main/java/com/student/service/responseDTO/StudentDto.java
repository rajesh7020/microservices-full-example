package com.student.service.responseDTO;

import com.student.service.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data
class StudentDto {

    private Student student;
    private Department department;
}
