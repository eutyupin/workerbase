package ru.test.workerbase.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.workerbase.converters.EmployeeDtoToEmployeeConverter;
import ru.test.workerbase.converters.EmployeeToDtoConverter;
import ru.test.workerbase.dtos.EmployeeDto;
import ru.test.workerbase.repositories.EmployeeRepository;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeToDtoConverter employeeToDtoConverter;
    private final EmployeeDtoToEmployeeConverter employeeDtoToEmployeeConverter;

    public List<EmployeeDto> findAllEmployees() {
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        employeeRepository.findAllEmployees().forEach(e -> employeeDtos.add(employeeToDtoConverter.employeeConvertToDto(e)));
        return employeeDtos;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public void createEmployee(EmployeeDto employeeDto) {
        employeeRepository.save(employeeDtoToEmployeeConverter.convertToEmployee(employeeDto));
    }

}
