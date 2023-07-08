package spring.spring_data_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);
}
