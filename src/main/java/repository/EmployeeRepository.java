package repository;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
}
