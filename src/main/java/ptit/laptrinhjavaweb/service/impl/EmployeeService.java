package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.EmployeeEntity;
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
	public void saveCustomer(EmployeeEntity getEmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeEntity getEmployee(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		
	}

}
