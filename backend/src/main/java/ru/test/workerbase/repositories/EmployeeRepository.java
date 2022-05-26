package ru.test.workerbase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.workerbase.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    }
