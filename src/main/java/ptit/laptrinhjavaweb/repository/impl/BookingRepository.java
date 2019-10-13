package ptit.laptrinhjavaweb.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	@Transactional
	public List<BookingEntity> getBooking() {
		Session session = sessionFactory.getCurrentSession();
		try { 
			Query<BookingEntity> listBook = session.createQuery("from BookingEntity",BookingEntity.class);
			List<BookingEntity> getBook = listBook.getResultList();
			return getBook;
		} catch (Exception e) {
			e.printStackTrace();
			session=sessionFactory.openSession();
		}
		return new ArrayList<>();
	}

	@Override
	@Transactional
	public BookingEntity saveBooing(BookingEntity booking) {
		Session session = sessionFactory.getCurrentSession();
		try {
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

	@Override
	@Transactional
	public BookingEntity getBooking(Integer id) {
		Session session=sessionFactory.getCurrentSession();
		try {
			BookingEntity booking = session.get(BookingEntity.class, id);
			System.out.println(booking);
			return booking;
		} catch (HibernateException e) {
			e.printStackTrace();
			session = sessionFactory.openSession();
		}
		return new BookingEntity();
	}


}
