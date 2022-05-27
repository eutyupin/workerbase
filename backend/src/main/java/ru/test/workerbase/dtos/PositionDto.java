package ru.test.workerbase.dtos;

import lombok.Data;
import ru.test.workerbase.entities.Category;

@Data
public class PositionDto {

    private Long id;

    private String title;

    private Category category;
}
