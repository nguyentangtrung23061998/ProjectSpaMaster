package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.EmployeeEntity;
import ptit.laptrinhjavaweb.repository.IEmployeeRepository;

@Repository
public class EmployeeRepository implements IEmployeeRepository{
	@Autowired
	private SessionFactory sessionFactory;

	private Session session;
	
	
	@Override
	@Transactional
	public List<EmployeeEntity> getEmployees() {
		try {
			session = sessionFactory.getCurrentSession();
			Query<EmployeeEntity> theQuery = session.createQuery("from EmployeeEntity", EmployeeEntity.class);
//			String hql = "from EmployeeEntity s where s.fullName=:fullName";
//			Query theQuery = session.createQuery(hql);
			theQuery.setParameter("fullName", "LISA MARIO");
			List<EmployeeEntity> customers = theQuery.getResultList();
			return customers;
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		return new ArrayList<>();
	}

	@Override
	public void saveStoreKeeper(EmployeeEntity employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeEntity getEmployee(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		
	}

}
