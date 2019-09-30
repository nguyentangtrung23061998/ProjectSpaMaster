package ptit.laptrinhjavaweb.service;

import java.util.List;

import ptit.laptrinhjavaweb.entity.StoreEntity;

public interface IStoreService {
	public List<StoreEntity> getCustomers();
	public void saveCustomer(StoreEntity theCustomer);

	public StoreEntity getStore(int theId);

	public void deleteStore(int theId);
}
