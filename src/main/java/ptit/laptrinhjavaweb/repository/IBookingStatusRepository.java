package ptit.laptrinhjavaweb.repository;

import ptit.laptrinhjavaweb.entity.BookingStatusEntity;

public interface IBookingStatusRepository {
	public BookingStatusEntity getBookingStatusDefault();
	public BookingStatusEntity getBookingStatusParam(Integer id);
}
