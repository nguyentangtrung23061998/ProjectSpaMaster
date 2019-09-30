package ptit.laptrinhjavaweb.service;

import java.util.List;

import ptit.laptrinhjavaweb.entity.BookingEntity;

public interface IBookingService {
	public List<BookingEntity> getBooking();
	public BookingEntity saveBooing(BookingEntity booking);
}
