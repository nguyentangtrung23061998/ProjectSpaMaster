package ptit.laptrinhjavaweb.repository;

import java.util.List;

import ptit.laptrinhjavaweb.entity.StoreEntity;
import ptit.laptrinhjavaweb.entity.StorekeeperEntity;

public interface IStoreKeeperRepository {
	public List<StorekeeperEntity> getStoreKeepers();
	public void saveStoreKeeper(StorekeeperEntity storeStoreKeeper);

	public StorekeeperEntity getStoreKeeper(int theId);

	public void deleteStoreKeeper(int theId);
}
