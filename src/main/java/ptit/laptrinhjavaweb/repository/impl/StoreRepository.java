package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.StoreEntity;
import ptit.laptrinhjavaweb.repository.IStoreRepository;

@Repository
public class StoreRepository implements IStoreRepository{

	@Autowired
	private SessionFactory sessionFactory;
	// Session session = factory.getCurrentSession();

//	@Autowired
	private Session session;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	@Transactional
	public List<StoreEntity> getStores() {

		try {
			session = sessionFactory.getCurrentSession();
			Query<StoreEntity> theQuery = session.createQuery("from StoreEntity", StoreEntity.class);
			List<StoreEntity> customers = theQuery.getResultList();
			return customers;
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		return new ArrayList<>();
	}

	@Override
	@Transactional
	public void saveStore(StoreEntity storeStore) {
		try {
			session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(storeStore);

		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
	}

	@Override
	@Transactional
	public StoreEntity getStore(int theId) {

		try {
			session = sessionFactory.getCurrentSession();
			StoreEntity theStore = session.get(StoreEntity.class, theId);
			return theStore;
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		return null;
	}

	@Override
	@Transactional
	public void deleteStore(int theId) {
		// get the current hibernate session
//		Session currentSession = sessionFactory.getCurrentSession();
//
//		// delete object with primary key
//		Query theQuery = currentSession.createQuery("delete from store where id=:storeid");
//		theQuery.setParameter("storeid", theId);
//
//		theQuery.executeUpdate();
		try {
			session = sessionFactory.getCurrentSession();
			Query theQuery = session.createQuery("delete from store where id=:storeid");
			theQuery.setParameter("storeid", theId);
			theQuery.executeUpdate();
		} catch (Exception e) {
			session = sessionFactory.openSession();
		}
	}
}
