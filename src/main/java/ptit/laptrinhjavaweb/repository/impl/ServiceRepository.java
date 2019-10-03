package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.repository.IServiceRepository;

@Repository
public class ServiceRepository implements IServiceRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session session;
	
	@Override
	@Transactional
	public List<ServiceEntity> getserviceRepositorys() {
		try {
			session = sessionFactory.getCurrentSession();
			Query<ServiceEntity> theQuery = session.createQuery("from ServiceEntity", ServiceEntity.class);
			List<ServiceEntity> services = theQuery.getResultList();
			return services;
		} catch (Exception e) {
			// TODO: handle exception
			session = sessionFactory.openSession();
		}
		return new ArrayList<>();
	}

	@Override
	@Transactional
	public ServiceEntity getService(int id) {
		try {
			session = sessionFactory.getCurrentSession();
			ServiceEntity service = session.get(ServiceEntity.class, id);
			return service;
			
		} catch (Exception e) {
			session=sessionFactory.openSession();
		}
		return new ServiceEntity();
	}

}
