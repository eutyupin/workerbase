package ru.test.workerbase.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.test.workerbase.dtos.PositionDto;
import ru.test.workerbase.services.PositionService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/positions")
@RequiredArgsConstructor
public class PositionController {
    private final PositionService positionService;

    @GetMapping
    public List<PositionDto> getAllPositions() {
        return positionService.findAllPositions();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPosition(PositionDto positionDto) {
        positionService.createPosition(positionDto);
    }

    @DeleteMapping("/{id}")
    public void deletePosition(@PathVariable Long id) {
        positionService.deletePosition(id);
    }
}
