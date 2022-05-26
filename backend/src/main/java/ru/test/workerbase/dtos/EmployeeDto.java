package ru.test.workerbase.dtos;

import lombok.Data;

@Data
public class EmployeeDto {

    private Long id;

    private String fio;

    private String gender;

    private Integer age;

    private String position;

    private String address;

    private String createdAt;

    private String updatedAt;
}
