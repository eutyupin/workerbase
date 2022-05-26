package ru.test.workerbase.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.workerbase.dtos.EmployeeDto;
import ru.test.workerbase.dtos.PositionDto;
import ru.test.workerbase.services.EmployeeService;
import ru.test.workerbase.services.PositionService;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
@RequiredArgsConstructor
public class PositionController {
    private final PositionService positionService;

    @GetMapping
    public List<PositionDto> getAllPositions() {
        return positionService.findAllPositions();
    }
}
