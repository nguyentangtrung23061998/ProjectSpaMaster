package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.BookingStatusEntity;
import ptit.laptrinhjavaweb.repository.IBookingStatusRepository;

@Repository
public class BookingStatusRepository implements IBookingStatusRepository{

	public final static int idBooked = 1;
	public final static int idCancelled = 2;
	public final static int idSuccessful = 3;
	public final static int idNoShow = 4;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public BookingStatusEntity getBookingStatusDefault() {
		Session session = sessionFactory.getCurrentSession();
		try {
			String hql = "from BookingStatusEntity as b where b.id=:idBooked";
			Query query = session.createQuery(hql);
			query.setParameter("idBooked", idBooked);
			BookingStatusEntity bookingStatus = (BookingStatusEntity) query.uniqueResult();
			return bookingStatus;
		} catch (Exception e) {
			session= sessionFactory.openSession();
		}
		return new BookingStatusEntity();
	}

	@Override
	@Transactional
	public BookingStatusEntity getBookingStatusParam(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		try {
			String hql = "from BookingStatusEntity as b where b.id=:idBooked";
			Query query = session.createQuery(hql);
			if(id==idBooked) {
				query.setParameter("idBooked", idBooked);
			}else if(id==idCancelled) {
				query.setParameter("idBooked", idCancelled);
			}else if(id==idSuccessful) {
				query.setParameter("idBooked", idSuccessful);
			}else if(id==idNoShow) {
				query.setParameter("idBooked", idNoShow);
			}
			
			BookingStatusEntity bookingStatus = (BookingStatusEntity) query.uniqueResult();
			return bookingStatus;
		} catch (Exception e) {
			session= sessionFactory.openSession();
		}
		return new BookingStatusEntity();
	}
	
	

}
