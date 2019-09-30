package ptit.laptrinhjavaweb.service;

import java.util.List;

import ptit.laptrinhjavaweb.entity.CustomerEntity;

public interface ICustomerService {
	public List<CustomerEntity> getCustomers();
	public void saveCustomer(CustomerEntity theCustomer);

	public CustomerEntity getStore(int theId);

	public void deleteStore(int theId);
}
