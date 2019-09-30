package ptit.laptrinhjavaweb.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.repository.IBookingRepository;

@Repository
public class BookingRepository implements IBookingRepository{

	@Autowired
	SessionFactory sesionFactory;
	
	@Override
	public List<BookingEntity> getBooking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public BookingEntity saveBooing(BookingEntity booking) {
		Session session;
		session = sesionFactory.getCurrentSession();
		try {
			session.save(booking);
			session.getTransaction().commit();
			return booking;
		} catch (Exception e) {
			session= sesionFactory.openSession();
		}
		return new BookingEntity();
	}

}
