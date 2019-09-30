package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.StoreEntity;
import ptit.laptrinhjavaweb.repository.ICustomerRepository;

@Repository
public class CustomerRepository implements ICustomerRepository{
	@Autowired
	private SessionFactory sessionFactory;

	private Session session;
	
	@Override
	@Transactional
	public List<CustomerEntity> getCustomer() {
		try {
			session = sessionFactory.getCurrentSession();
			Query<CustomerEntity> theQuery = session.createQuery("from CustomerEntity", CustomerEntity.class);
			List<CustomerEntity> customers = theQuery.getResultList();
			return customers;
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		return new ArrayList<>();
	}

	@Override
	@Transactional
	public void saveCustomer(CustomerEntity customer) {
		try {
			session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(customer);

		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
	}

	@Override
	@Transactional
	public CustomerEntity getCustomer(int theId) {
		try {
			session = sessionFactory.getCurrentSession();
			CustomerEntity customer = session.get(CustomerEntity.class, theId);
			return customer;
		} catch (Exception e) {
			session = sessionFactory.openSession();
		}
		return new CustomerEntity();
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public List getInfoCustomer(String username, String passsword) {
//		try {
//			session=sessionFactory.getCurrentSession();
//			String hql = "from CustomerEntity as cus where cus.username=:username and cus.password=:password";
//			Query<CustomerEntity> customer = session.createQuery(hql,CustomerEntity.class);
//			customer.setParameter("username", username);
//			customer.setParameter("passsword", passsword);
//			List userObj = customer.getResultList();
//			return userObj;
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			session=sessionFactory.openSession();
//		}
//		return new ArrayList<>();
//	}

}
