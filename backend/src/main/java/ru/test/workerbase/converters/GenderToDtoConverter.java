package ru.test.workerbase.converters;

import org.springframework.stereotype.Component;
import ru.test.workerbase.dtos.GenderDto;
import ru.test.workerbase.entities.Gender;

@Component
public class GenderToDtoConverter {

    public GenderDto convertGenderToDto(Gender gender) {
        GenderDto genderDto = new GenderDto();
        genderDto.setId(gender.getId());
        genderDto.setTitle(gender.getTitle());
        return genderDto;
    }
}
