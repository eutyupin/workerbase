package ru.test.workerbase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.workerbase.entities.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {

//    @Query(value="SELECT * FROM positions", nativeQuery=true)
//    List<Position> findAllPositions();

}
