package in.aurosoft.service;

import java.util.List;

import in.aurosoft.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(Integer id);
	
	void deleteEmployeeById(Integer id);
}
