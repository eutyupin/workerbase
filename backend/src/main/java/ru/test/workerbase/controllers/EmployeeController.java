package ru.test.workerbase.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.test.workerbase.dtos.EmployeeDto;
import ru.test.workerbase.services.EmployeeService;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(EmployeeDto employeeDto) {
        employeeService.createEmployee(employeeDto);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

}
