package ptit.laptrinhjavaweb.service;

import java.util.List;

import ptit.laptrinhjavaweb.entity.CustomerEntity;

public interface ICustomerService {
	public List<CustomerEntity> getCustomers();
	public void saveCustomer(CustomerEntity theCustomer);
	public CustomerEntity cus(String uname, String upwd);
	public CustomerEntity getCustomer(int theId);
	public CustomerEntity updateCustomer(CustomerEntity customer);
	public void deleteCustomer(int theId);
}
