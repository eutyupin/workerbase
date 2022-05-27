package ru.test.workerbase.converters;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.test.workerbase.dtos.CategoryDto;
import ru.test.workerbase.entities.Category;

@Component
@RequiredArgsConstructor
public class CategoryDtoToCategoryConverter {

    public Category convertToCategory(CategoryDto categoryDto) {
        Category newCategory = new Category();
        newCategory.setTitle(categoryDto.getTitle());
        return  newCategory;
    }
}
