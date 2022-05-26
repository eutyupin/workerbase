package ru.test.workerbase.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.workerbase.converters.PositionToDtoConverter;
import ru.test.workerbase.dtos.PositionDto;
import ru.test.workerbase.repositories.PositionRepository;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PositionService {
    private final PositionRepository positionRepository;
    private final PositionToDtoConverter positionToDtoConverter;

    public List<PositionDto> findAllPositions() {
        List<PositionDto> positionDtos = new ArrayList<>();
        positionRepository.findAllPositions().forEach(p -> positionDtos.add(positionToDtoConverter.positionConvertToDto(p)));
        return positionDtos;
    }
}
