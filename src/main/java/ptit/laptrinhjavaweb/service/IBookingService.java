package ptit.laptrinhjavaweb.service;

import java.util.List;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;

public interface IBookingService {
	public List<BookingEntity> getBooking();
	public BookingEntity saveBooing(BookingEntity booking);
	public List<BookingEntity> getListBookingClause(CustomerEntity customer);
	public BookingEntity getBooking(Integer theId);
}
