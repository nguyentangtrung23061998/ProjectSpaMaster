package ptit.laptrinhjavaweb.repository;

import java.util.List;

import javax.persistence.Table;

import ptit.laptrinhjavaweb.entity.EmployeeEntity;



public interface IEmployeeRepository {
	public List<EmployeeEntity> getEmployees();
	public void saveEmployee(EmployeeEntity employee);

	public EmployeeEntity getEmployee(int theId);

	public void deleteEmployee(int theId);
	public EmployeeEntity updateEmployee(EmployeeEntity employee);
}
