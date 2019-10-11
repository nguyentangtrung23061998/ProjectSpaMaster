package ptit.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.StorekeeperEntity;
import ptit.laptrinhjavaweb.repository.IAuthAdminRepository;
import ptit.laptrinhjavaweb.service.IAuthAdminService;

@Service
public class AuthAdminService implements IAuthAdminService{

	@Autowired
	IAuthAdminRepository authAdminRepository;
	
	@Override
	public StorekeeperEntity storeKeeper(String username, String password) {
		return authAdminRepository.findUser(username, password);
	}

}
