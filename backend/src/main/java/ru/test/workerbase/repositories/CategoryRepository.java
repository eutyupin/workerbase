package ru.test.workerbase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.test.workerbase.entities.Category;

import java.util.List;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(value="SELECT * FROM categories", nativeQuery=true)
    List<Category> findAllCategories();

//    Создание новой категории в RAW SQL
//    INSERT INTO categories(title) values(newCategory.title);

//    Удаление категории в RAW SQL
//    DELETE FROM categories WHERE categories.id = category.id




}
