package ptit.laptrinhjavaweb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.StorekeeperEntity;
import ptit.laptrinhjavaweb.repository.IStoreKeeperRepository;
import ptit.laptrinhjavaweb.service.IStoreKeeperService;

@Service
public class StoreKeeperService implements IStoreKeeperService{
	
	@Autowired
	private IStoreKeeperRepository storeKeeperRepository;
	
	@Override
	@Transactional
	public StorekeeperEntity getStoreKeeper(int theId) {
		
		return storeKeeperRepository.getStoreKeeper(theId);
	}

}
