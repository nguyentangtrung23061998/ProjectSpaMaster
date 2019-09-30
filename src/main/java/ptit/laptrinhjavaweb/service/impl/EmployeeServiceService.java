package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.EmployeeServiceEntity;
import ptit.laptrinhjavaweb.repository.IEmployeeServiceRepository;
import ptit.laptrinhjavaweb.service.IEmpoyeeServiceService;

@Service
public class EmployeeServiceService implements IEmpoyeeServiceService{

	@Autowired
	private IEmployeeServiceRepository employeeService;
	
	@Override
	public List<EmployeeServiceEntity> getEmployeeServices() {
		return employeeService.getEmployeeServices();
	}

}
