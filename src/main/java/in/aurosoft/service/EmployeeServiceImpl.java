package in.aurosoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aurosoft.entity.Employee;
import in.aurosoft.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> getAllEmployee() {
		
		return repository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.repository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> optional = repository.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id:: "+id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		this.repository.deleteById(id);
		
	}

}
