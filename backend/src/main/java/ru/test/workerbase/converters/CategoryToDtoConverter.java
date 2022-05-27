package ru.test.workerbase.converters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.test.workerbase.dtos.CategoryDto;
import ru.test.workerbase.entities.Category;

@Component
@RequiredArgsConstructor
public class CategoryToDtoConverter {

    public CategoryDto convertToDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setTitle(category.getTitle());
        return categoryDto;
    }
}
