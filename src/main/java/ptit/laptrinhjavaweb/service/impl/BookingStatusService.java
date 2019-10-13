package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.BookingStatusEntity;
import ptit.laptrinhjavaweb.repository.IBookingStatusRepository;
import ptit.laptrinhjavaweb.service.IBookingStatusService;

@Service
public class BookingStatusService implements IBookingStatusService {

	@Autowired
	IBookingStatusRepository bookingStatusRepository;
	
	@Override
	public BookingStatusEntity getBookingStatusDefault() {
		return bookingStatusRepository.getBookingStatusDefault();
	}

	@Override
	public BookingStatusEntity getBookingStatusParam(Integer id) {
		return bookingStatusRepository.getBookingStatusParam(id);
	}

}
