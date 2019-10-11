package ptit.laptrinhjavaweb.service;

import ptit.laptrinhjavaweb.entity.CustomerEntity;

public interface IAuthCustomerService {
	public CustomerEntity findUser(String uname, String upwd);
}
