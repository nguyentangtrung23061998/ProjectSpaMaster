package ptit.laptrinhjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.EmployeeEntity;
import ptit.laptrinhjavaweb.entity.StoreEntity;
import ptit.laptrinhjavaweb.repository.IEmployeeRepository;
import ptit.laptrinhjavaweb.repository.IStoreRepository;
import ptit.laptrinhjavaweb.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@Autowired
	private IStoreRepository storeRepository; 
	
	@Override
	public List<EmployeeEntity> getEmployees() {
		List<EmployeeEntity> listEmployees = employeeRepository.getEmployees();
		return listEmployees;
	}

	@Override
	public void saveEmployee(EmployeeEntity getEmployee) {
		EmployeeEntity employee = getEmployee;
		employee.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		StoreEntity store = storeRepository.getStore(3);
		employee.setStore(store);
		employeeRepository.saveEmployee(employee);
	}

	@Override
	public EmployeeEntity getEmployee(int theId) {
		return employeeRepository.getEmployee(theId);
	}

	@Override
	public void deleteEmployee(int theId) {
		employeeRepository.deleteEmployee(theId);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employee) {
		return employeeRepository.updateEmployee(employee);
	}

}
