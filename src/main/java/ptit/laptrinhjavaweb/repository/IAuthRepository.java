package ptit.laptrinhjavaweb.repository;

import ptit.laptrinhjavaweb.entity.CustomerEntity;

public interface IAuthRepository {
	public CustomerEntity findUser(String username, String passwordString);
}
