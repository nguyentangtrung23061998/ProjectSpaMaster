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
import ptit.laptrinhjavaweb.repository.IAuthRepository;

@Repository
public class AuthRepository implements IAuthRepository{
	
	private static Logger log = Logger.getLogger(AuthRepository.class);
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional 
	public CustomerEntity findUser(String username, String password) {
		Session session =sessionFactory.getCurrentSession();
		String hql = "from CustomerEntity as cus where cus.username=:username and cus.password=:password";
		
		boolean isValidQuery = false;
		try {
			Query query = session.createQuery(hql);
			query.setParameter("username",username);
			query.setParameter("password", password);
			CustomerEntity customer = (CustomerEntity) query.uniqueResult();
//			List userObj = query.list();
//			if(userObj != null && userObj.size()>0) {
//				isValidQuery=true;
//			}
//			CustomerEntity customer = session.get(CustomerEntity.class, 15);
			session.clear();
			return customer;
		} catch (Exception e) {
			// TODO: handle exception
//			isValidQuery=false;
			e.printStackTrace();
		}
		return new CustomerEntity();

	}

}
