package ptit.laptrinhjavaweb.repository;

import ptit.laptrinhjavaweb.entity.CustomerEntity;

public interface IAuthCustomerRepository {
	public CustomerEntity findUser(String username, String passwordString);
}
