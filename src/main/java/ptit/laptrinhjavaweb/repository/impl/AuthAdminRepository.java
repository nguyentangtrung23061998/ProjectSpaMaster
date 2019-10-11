package ptit.laptrinhjavaweb.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.StorekeeperEntity;
import ptit.laptrinhjavaweb.repository.IAuthAdminRepository;
import ptit.laptrinhjavaweb.repository.IAuthCustomerRepository;

@Repository
public class AuthAdminRepository implements IAuthAdminRepository{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public StorekeeperEntity findUser(String username, String password) {
		Session session =sessionFactory.getCurrentSession();
		String hql = "from StorekeeperEntity as admin where admin.username=:username and admin.password=:password";
		try {
			Query query = session.createQuery(hql);
			query.setParameter("username",username);
			query.setParameter("password", password);
			StorekeeperEntity storeKeeper = (StorekeeperEntity) query.uniqueResult();
			session.clear();
			return storeKeeper;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
