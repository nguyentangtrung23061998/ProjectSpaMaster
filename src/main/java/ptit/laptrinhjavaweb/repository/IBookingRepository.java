package ptit.laptrinhjavaweb.repository;

import java.util.List;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.BookingStatusEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;

public interface IBookingRepository {
	public List<BookingEntity> getBooking();
	public BookingEntity saveBooing(BookingEntity booking);
	public List<BookingEntity> getBookingClause(CustomerEntity customer);
	public BookingEntity getBooking(Integer id);
}
