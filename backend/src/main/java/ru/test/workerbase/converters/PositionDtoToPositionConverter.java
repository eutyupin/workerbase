package ru.test.workerbase.converters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.test.workerbase.dtos.PositionDto;
import ru.test.workerbase.entities.Position;

import java.util.ArrayList;
@Component
@RequiredArgsConstructor
public class PositionDtoToPositionConverter {

    public Position convertToPosition(PositionDto positionDto) {
        Position position = new Position();
        position.setId(null);
        position.setTitle(positionDto.getTitle());
        position.setCategory(positionDto.getCategory());
        position.setEmployees(new ArrayList<>());
        return  position;
    }
}
