package ptit.laptrinhjavaweb.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.StorekeeperEntity;
import ptit.laptrinhjavaweb.repository.IStoreKeeperRepository;
import ptit.laptrinhjavaweb.util.Util;

@Repository
public class StoreKeeperRepository implements IStoreKeeperRepository{
	
	private static final Logger log = Logger.getLogger(StoreKeeperRepository.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session session;
	
	@Override
	public List<StorekeeperEntity> getStoreKeepers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveStoreKeeper(StorekeeperEntity storeStoreKeeper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public StorekeeperEntity getStoreKeeper(int theId) {
		try {
			session = sessionFactory.getCurrentSession();
			StorekeeperEntity storeKeeper= session.get(StorekeeperEntity.class, theId);
			return storeKeeper;
		} catch (Exception e) {
			session=sessionFactory.openSession();
			log.error(Util.convertExceptionToString(e));
		}
		return new StorekeeperEntity();
	}

	@Override
	public void deleteStoreKeeper(int theId) {
		// TODO Auto-generated method stub
		
	}
	
}
