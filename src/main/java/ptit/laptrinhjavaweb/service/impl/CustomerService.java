package ptit.laptrinhjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.repository.ICustomerRepository;
import ptit.laptrinhjavaweb.repository.IStoreKeeperRepository;
import ptit.laptrinhjavaweb.service.ICustomerService;

@Service
@Transactional
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;
	
	@Autowired
	private IStoreKeeperRepository storeKeeperRepository;
	
	private static String owner="trung đẹp trai";
	
	@Override
	public List<CustomerEntity> getCustomers() {
		return customerRepository.getCustomers();
	}

	@Override
	public void saveCustomer(CustomerEntity theCustomer) {
		CustomerEntity customerEnity = theCustomer;
		customerEnity.setToken("");
		customerEnity.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		customerEnity.setCreatedBy(this.owner);
		customerEnity.setStorekeeper(storeKeeperRepository.getStoreKeeper(3));
		customerRepository.saveCustomer(customerEnity);
	}

	@Override
	public CustomerEntity getCustomer(int theId) {
//		return storeKeeperRepository.get;
		return customerRepository.getCustomer(theId);
	}

	@Override
	public void deleteCustomer(int theId) {
		customerRepository.deleteCustomer(theId);
	}

	@Override
	public CustomerEntity cus(String uname, String upwd) {
		return customerRepository.findUser(uname, upwd);
	}

	@Override
	public CustomerEntity updateCustomer(CustomerEntity customer) {
		return customerRepository.updateCustomer(customer);
	}

	
}
