package ptit.laptrinhjavaweb.repository;

import java.util.List;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.StoreEntity;

public interface ICustomerRepository {
	public List<CustomerEntity> getCustomer();
	
//	public CustomerEntity getInfoCustomer(String username, String passsword);
	
	public void saveCustomer(CustomerEntity customer);

	public CustomerEntity getCustomer(int theId);

	public void deleteCustomer(int theId);
}
