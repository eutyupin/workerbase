package ru.test.workerbase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.test.workerbase.entities.Employee;
import ru.test.workerbase.entities.Position;

import java.util.List;

@Repository
public interface PositionRepository extends JpaRepository<Employee, Long> {

    @Query(value="SELECT * FROM positions", nativeQuery=true)
    List<Position> findAllPositions();

}
