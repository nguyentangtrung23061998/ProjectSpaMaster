package ptit.laptrinhjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.repository.ICustomerRepository;
import ptit.laptrinhjavaweb.repository.IStoreKeeperRepository;
import ptit.laptrinhjavaweb.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;
	
	@Autowired
	private IStoreKeeperRepository storeKeeperRepository;
	
	private static String owner="trung đẹp trai";
	
	@Override
	public List<CustomerEntity> getCustomers() {
		return customerRepository.getCustomer();
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
	public CustomerEntity getStore(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStore(int theId) {
		// TODO Auto-generated method stub
		
	}

}
