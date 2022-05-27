package ru.test.workerbase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.test.workerbase.entities.Gender;

public interface GenderRepository  extends JpaRepository<Gender, Long> {
}
