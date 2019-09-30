package ptit.laptrinhjavaweb.service;

import java.util.List;

import ptit.laptrinhjavaweb.entity.EmployeeEntity;

public interface IEmployeeService {
	public List<EmployeeEntity> getEmployees();
	public void saveCustomer(EmployeeEntity getEmployee);

	public EmployeeEntity getEmployee(int theId);

	public void deleteEmployee(int theId);
}
