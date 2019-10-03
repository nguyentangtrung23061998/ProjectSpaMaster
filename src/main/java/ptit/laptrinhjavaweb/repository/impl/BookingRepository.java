package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.repository.IBookingRepository;

@Repository
public class BookingRepository implements IBookingRepository{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<BookingEntity> getBooking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public BookingEntity saveBooing(BookingEntity booking) {
		Session session;
//		session = sesionFactory.getCurrentSession();
		try {
			session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(booking);
			return booking;
		} catch (Exception e) {
			e.printStackTrace();
			session= sessionFactory.openSession();
		}
		return new BookingEntity();
	}

	@Override
	@Transactional
	public List<BookingEntity> getBookingClause(CustomerEntity customer) {
		Session session=sessionFactory.getCurrentSession();
		//select b.id,b.bookingdate,b.minutes,b.endtime ,b.customerid,c.id 
		String hql = "from BookingEntity as b "
				+ "where b.customer=:customer";
		try {
			Query query =session.createQuery(hql);
			query.setParameter("customer", customer);
			List theList = query.getResultList();
			return theList;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

}
