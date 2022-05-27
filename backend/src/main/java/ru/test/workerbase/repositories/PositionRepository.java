package ru.test.workerbase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.test.workerbase.entities.Position;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {

//    В ЗАКОММЕНТИРОВАННЫХ СЕКЦИЯХ ЗАПРОСЫ, КАК ОНИ БЫЛИ БЫ НАПИСАНЫ
//    МНОЮ С ИСПОЛЬЗОВАНИЕМ ЧМСТОГО SQL

//    SELECT p.id, p.title, c.title category
//    FROM positions p
//    JOIN categories c
//    ON p.category_id = c.id;
//
    @Query(value="SELECT * FROM positions " +
            "JOIN categories " +
            "ON positions.category_id = categories.id;", nativeQuery=true)
    List<Position> findAllPositions();

//    Создание новой должности в RAW SQL
//    INSERT INTO positions(title, category_id)
//    VALUES(newPosition.title, newPosition.category.id);

//    Удаление должности в RAW SQL
//    DELETE FROM positions WHERE positions.id = position.id




}
