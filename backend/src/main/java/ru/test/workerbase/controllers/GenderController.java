package ru.test.workerbase.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.workerbase.dtos.CategoryDto;
import ru.test.workerbase.dtos.GenderDto;
import ru.test.workerbase.services.GenderService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
@RequestMapping("/api/genders")
public class GenderController {
    private final GenderService genderService;

    @GetMapping
    public List<GenderDto> findAllGenders() {
        return genderService.findAllGenders();
    }
}
