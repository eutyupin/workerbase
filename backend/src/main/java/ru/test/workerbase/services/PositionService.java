package ru.test.workerbase.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.workerbase.converters.PositionDtoToPositionConverter;
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
    private final PositionDtoToPositionConverter positionDtoToPositionConverter;

    public List<PositionDto> findAllPositions() {
        List<PositionDto> positionDtos = new ArrayList<>();
        positionRepository.findAllPositions().forEach(p -> positionDtos.add(positionToDtoConverter.positionConvertToDto(p)));
        return positionDtos;
    }

    public void createPosition(PositionDto positionDto) {
        positionRepository.save(positionDtoToPositionConverter.convertToPosition(positionDto));
    }

    public void deletePosition(Long id) {
        positionRepository.deleteById(id);
    }
}
