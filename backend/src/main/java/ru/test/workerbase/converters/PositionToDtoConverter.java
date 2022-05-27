package ru.test.workerbase.converters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.test.workerbase.dtos.PositionDto;
import ru.test.workerbase.entities.Position;

@Component
@RequiredArgsConstructor
public class PositionToDtoConverter {
    public PositionDto positionConvertToDto(Position position) {
        PositionDto positionDto = new PositionDto();
        positionDto.setId(position.getId());
        positionDto.setTitle(position.getTitle());
        positionDto.setCategory(position.getCategory());
        return positionDto;
    }
}
