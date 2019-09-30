package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.StoreEntity;
import ptit.laptrinhjavaweb.repository.IStoreRepository;
import ptit.laptrinhjavaweb.service.IStoreService;

@Service
public class StoreService implements IStoreService {

	@Autowired
	private IStoreRepository storeRepository;

	@Override
//	@Transactional
	public List<StoreEntity> getCustomers() {
		return storeRepository.getStores();
	}

	@Override
	public void saveCustomer(StoreEntity theStore) {
		storeRepository.saveStore(theStore);
		
	}

	@Override
	public StoreEntity getStore(int theId) {
		// TODO Auto-generated method stub
		StoreEntity store = storeRepository.getStore(theId);
		return store;
	}

	@Override
	public void deleteStore(int theId) {
		// TODO Auto-generated method stub
		storeRepository.deleteStore(theId);
	}
}
