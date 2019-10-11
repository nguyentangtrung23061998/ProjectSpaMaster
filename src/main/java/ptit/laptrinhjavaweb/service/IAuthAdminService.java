package ptit.laptrinhjavaweb.service;

import ptit.laptrinhjavaweb.entity.StorekeeperEntity;

public interface IAuthAdminService {
	public StorekeeperEntity storeKeeper(String username,String password);
}
