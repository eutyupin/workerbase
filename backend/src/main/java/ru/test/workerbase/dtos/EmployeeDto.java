package ru.test.workerbase.dtos;

import lombok.Data;
import ru.test.workerbase.entities.Gender;
import ru.test.workerbase.entities.Position;

@Data
public class EmployeeDto {

    private Long id;

    private String fio;

    private Gender gender;

    private Integer age;

    private Position position;

    private String address;

    private String createdAt;

    private String updatedAt;
}
