package ptit.laptrinhjavaweb.repository;

import java.util.List;

import ptit.laptrinhjavaweb.entity.BookingEntity;

public interface IBookingRepository {
	public List<BookingEntity> getBooking();
	public BookingEntity saveBooing(BookingEntity booking);
}
