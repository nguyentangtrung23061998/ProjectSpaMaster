package ptit.laptrinhjavaweb.repository;

import java.util.List;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.StoreEntity;

public interface ICustomerRepository {
	public List<CustomerEntity> getCustomers();
	
	public CustomerEntity findUser(String username, String password);
	
	public void saveCustomer(CustomerEntity customer);
	
	public CustomerEntity updateCustomer(CustomerEntity customer);

	public CustomerEntity getCustomer(int theId);

	public void deleteCustomer(int theId);
}
