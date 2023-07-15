package in.aurosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aurosoft.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
