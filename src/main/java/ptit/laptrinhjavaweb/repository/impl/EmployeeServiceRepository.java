package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.EmployeeServiceEntity;
import ptit.laptrinhjavaweb.repository.IEmployeeServiceRepository;

@Repository
public class EmployeeServiceRepository implements IEmployeeServiceRepository {

	@Autowired
	private SessionFactory sessionFactory;

	private Session session;

	@Override
	@Transactional
	public List<EmployeeServiceEntity> getEmployeeServices() {
		try {
			session = sessionFactory.getCurrentSession();
			String hql = "select b.nameservice, e.fullname from employe_service as a,employee as e, service as b "
					+ "where a.employeeid = e.id and  a.serviceid = b.id";
			Query<EmployeeServiceEntity> theQuery = session.createQuery("from EmployeeServiceEntity",
					EmployeeServiceEntity.class);

			
			List<EmployeeServiceEntity> employeeServices = theQuery.getResultList();
//			List theList = query.list();
			return employeeServices;
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		return new ArrayList<>();
	}

}
