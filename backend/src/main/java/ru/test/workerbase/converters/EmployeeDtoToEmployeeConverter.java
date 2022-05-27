package ru.test.workerbase.converters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.test.workerbase.dtos.EmployeeDto;
import ru.test.workerbase.entities.Employee;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class EmployeeDtoToEmployeeConverter {

    public Employee convertToEmployee(EmployeeDto employeeDto) {
        Employee newEmployee = new Employee();
        newEmployee.setId(null);
        newEmployee.setFio(employeeDto.getFio());
        newEmployee.setAge(employeeDto.getAge());
        newEmployee.setAddress(employeeDto.getAddress());
        newEmployee.setPosition(employeeDto.getPosition());
        newEmployee.setGender(employeeDto.getGender());
        newEmployee.setCreatedAt(LocalDateTime.now());
        newEmployee.setUpdatedAt(LocalDateTime.now());
        return newEmployee;
    }
}
