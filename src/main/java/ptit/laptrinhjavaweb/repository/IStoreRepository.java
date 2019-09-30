package ptit.laptrinhjavaweb.repository;

import java.util.List;

import ptit.laptrinhjavaweb.entity.StoreEntity;


public interface IStoreRepository{
	public List<StoreEntity> getStores();
	public void saveStore(StoreEntity storeStore);

	public StoreEntity getStore(int theId);

	public void deleteStore(int theId);
	
}
