package ru.test.workerbase.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.test.workerbase.converters.CategoryDtoToCategoryConverter;
import ru.test.workerbase.converters.CategoryToDtoConverter;
import ru.test.workerbase.dtos.CategoryDto;
import ru.test.workerbase.repositories.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryToDtoConverter categoryToDtoConverter;
    private final CategoryDtoToCategoryConverter categoryDtoToCategoryConverter;

    public List<CategoryDto> findAllCategories() {
        List<CategoryDto> categoriesList = new ArrayList<>();
        categoryRepository.findAll().forEach(c -> {
            categoriesList.add(categoryToDtoConverter.convertToDto(c));
        });
        return  categoriesList;
    }

    public void createCategory(CategoryDto categoryDto) {
        categoryRepository.save(categoryDtoToCategoryConverter.convertToCategory(categoryDto));
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
