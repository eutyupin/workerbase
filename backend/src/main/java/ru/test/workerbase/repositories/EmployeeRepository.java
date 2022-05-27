package ru.test.workerbase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.test.workerbase.entities.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//    В ЗАКОММЕНТИРОВАННЫХ СЕКЦИЯХ ЗАПРОСЫ, КАК ОНИ БЫЛИ БЫ НАПИСАНЫ
//    МНОЮ С ИСПОЛЬЗОВАНИЕМ ЧМСТОГО SQL

//    SELECT e.id, e.fio, g.title gender, e.age, p.title position, e.address, e.updated_at, e.created_at " +
//            "FROM employees e " +
//            "JOIN positions p ON e.position_id = p.id " +
//            "JOIN genders g on e.gender_id = g.id " +
//            "ORDER BY e.id;


    @Query(value = "SELECT * FROM employees " +
            "JOIN positions ON employees.position_id = positions.id " +
            "JOIN genders on employees.gender_id = genders.id " +
            "ORDER BY employees.id;", nativeQuery = true)
    List<Employee> findAllEmployees();

//    Создание нового рабочего в RAW SQL
//    INSERT INTO employees(fio, gender_id, age, position_id, address)
//    VALUES(newEmployee.fio, newEmployee.gender.id, newEmployee.age, newEmployee.posotion.id, newEmployee.address);

//    Удаление рабочего в RAW SQL
//    DELETE FROM employees WHERE employees.id = employee.id

//

}