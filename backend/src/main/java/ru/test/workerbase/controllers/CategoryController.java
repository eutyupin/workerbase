package ru.test.workerbase.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.test.workerbase.dtos.CategoryDto;
import ru.test.workerbase.services.CategoryService;

import java.util.List;

@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> findAllCategories() {
        return categoryService.findAllCategories();
    }

    @PostMapping
    public void createCategory(CategoryDto categoryDto) {
        categoryService.createCategory(categoryDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
