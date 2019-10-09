package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.repository.ICustomerRepository;

@Repository
public class CustomerRepository implements ICustomerRepository{
	@Autowired
	private SessionFactory sessionFactory;

	private Session session;
	
	@Override
	@Transactional
	public List<CustomerEntity> getCustomers() {
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
			System.out.println(customer);
//			session.clear();
			return customer;
		} catch (Exception e) {
			e.printStackTrace();
			session = sessionFactory.openSession();
		}
		return new CustomerEntity();
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		session=sessionFactory.getCurrentSession();
		try {
//			Query query =session.createQuery("delete from CustomerEntity where id=:theId");
			CustomerEntity customer = session.get(CustomerEntity.class, theId);
			//customer.addBooking(tempCustomer);
			if(customer != null) {
				session.delete(customer);
			}
//			query.setParameter("theId", theId);
//			query.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	@Transactional
	public CustomerEntity findUser(String username, String password) {
		session =sessionFactory.getCurrentSession();
		String hql = "from CustomerEntity as cus where cus.username=:username and cus.password=:password";
		
		boolean isValidQuery = false;
		try {
			Query query = session.createQuery(hql);
			query.setParameter("username",username);
			query.setParameter("password", password);
			List<CustomerEntity> cus = query.getResultList();
			System.out.println(cus);
			//CustomerEntity customer = (CustomerEntity) query.uniqueResult();
//			List userObj = query.list();
//			if(userObj != null && userObj.size()>0) {
//				isValidQuery=true;
//			}
//			CustomerEntity customer = session.get(CustomerEntity.class, 15);
			session.clear();
			return cus.get(0);
		} catch (Exception e) {
			// TODO: handle exception
//			isValidQuery=false;
			e.printStackTrace();
		}
		return new CustomerEntity();

	}

	@Override
	@Transactional
	public CustomerEntity updateCustomer(CustomerEntity customer) {
		session = sessionFactory.getCurrentSession();
		try {
			session.update(customer);
			return customer;
		} catch (Exception e) {
			// TODO: handle exception
			session= sessionFactory.openSession();
		}
		return new CustomerEntity();
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
