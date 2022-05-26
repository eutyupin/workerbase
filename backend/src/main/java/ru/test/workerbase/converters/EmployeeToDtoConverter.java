package ru.test.workerbase.converters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.test.workerbase.dtos.EmployeeDto;
import ru.test.workerbase.entities.Employee;

@Component
@RequiredArgsConstructor
public class EmployeeToDtoConverter {
    public EmployeeDto employeeConvertToDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setFio(employee.getFio());
        employeeDto.setAge(employee.getAge());
        employeeDto.setAddress(employee.getAddress());
        employeeDto.setGender(employee.getGender().getTitle());
        employeeDto.setPosition(employee.getPosition().getTitle());
        employeeDto.setCreatedAt(employee.getCreatedAt().toString());
        employeeDto.setUpdatedAt(employee.getUpdatedAt().toString());
        return employeeDto;
    }
}
