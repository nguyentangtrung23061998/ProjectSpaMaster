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
			List<EmployeeEntity> customers = theQuery.getResultList();
			return customers;
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		return new ArrayList<>();
	}

	@Override
	@Transactional
	public void saveEmployee(EmployeeEntity employee) {
		try {
			session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(employee);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session = sessionFactory.openSession();
		}
		
	}

	@Override
	@Transactional
	public EmployeeEntity getEmployee(int theId) {
		try {
			session = sessionFactory.getCurrentSession();
			EmployeeEntity employee = session.get(EmployeeEntity.class, theId);
			System.out.println(employee);
			return employee;
		} catch (Exception e) {
			e.printStackTrace();
			session = sessionFactory.openSession();
		}
		return new EmployeeEntity();
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		session=sessionFactory.getCurrentSession();
		try {
			EmployeeEntity employee = session.get(EmployeeEntity.class, theId);
			if(employee != null) {
				session.delete(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	@Transactional
	public EmployeeEntity updateEmployee(EmployeeEntity employee) {
		session = sessionFactory.getCurrentSession();
		try {
			session.update(employee);
			return employee;
		} catch (Exception e) {
			// TODO: handle exception
			session= sessionFactory.openSession();
		}
		return new EmployeeEntity();
	
	}

}
