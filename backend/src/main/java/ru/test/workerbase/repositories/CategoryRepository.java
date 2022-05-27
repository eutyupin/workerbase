package ru.test.workerbase.repositories;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.workerbase.entities.Category;
import ru.test.workerbase.entities.Position;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
