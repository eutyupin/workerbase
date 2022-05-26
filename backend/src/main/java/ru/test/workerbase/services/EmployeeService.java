package ru.test.workerbase.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.workerbase.converters.EmployeeToDtoConverter;
import ru.test.workerbase.dtos.EmployeeDto;
import ru.test.workerbase.repositories.EmployeeRepository;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeToDtoConverter employeeToDtoConverter;

    public List<EmployeeDto> findAllEmployees() {
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        employeeRepository.findAll().forEach(e -> employeeDtos.add(employeeToDtoConverter.employeeConvertToDto(e)));
        return employeeDtos;
    }

}
