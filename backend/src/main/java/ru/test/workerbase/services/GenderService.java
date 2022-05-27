package ru.test.workerbase.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.workerbase.converters.GenderToDtoConverter;
import ru.test.workerbase.dtos.GenderDto;
import ru.test.workerbase.repositories.GenderRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GenderService {
    private final GenderRepository genderRepository;
    private final GenderToDtoConverter genderToDtoConverter;

    public List<GenderDto> findAllGenders() {
        List<GenderDto> genderDtoList = new ArrayList<>();
        genderRepository.findAll().forEach(g -> {
            genderDtoList.add(genderToDtoConverter.convertGenderToDto(g));
        });
        return genderDtoList;
    }
}
