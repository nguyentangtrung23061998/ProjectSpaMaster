package ptit.laptrinhjavaweb.repository;

import java.util.List;

import ptit.laptrinhjavaweb.dto.EmployeeServiceV;
import ptit.laptrinhjavaweb.entity.EmployeeServiceEntity;

public interface IEmployeeServiceRepository {
	public List<EmployeeServiceEntity> getEmployeeServices();
}
