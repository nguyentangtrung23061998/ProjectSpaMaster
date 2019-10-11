package ptit.laptrinhjavaweb.repository;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.StorekeeperEntity;

public interface IAuthAdminRepository {
	public StorekeeperEntity findUser(String username, String password);
}
