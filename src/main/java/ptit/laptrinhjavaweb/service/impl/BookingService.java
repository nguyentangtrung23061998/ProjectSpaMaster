package ptit.laptrinhjavaweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.StoreEntity;
import ptit.laptrinhjavaweb.repository.IBookingRepository;
import ptit.laptrinhjavaweb.repository.IStoreRepository;
import ptit.laptrinhjavaweb.service.IBookingService;

@Service
public class BookingService implements IBookingService{
	
	@Autowired
	private IBookingRepository bookingRepository;
	
	@Autowired 
	private IStoreRepository storeRepository;
	
	@Override
	public List<BookingEntity> getBooking() {
		return bookingRepository.getBooking();
	}

	@Override
	public BookingEntity saveBooing(BookingEntity booking) {
		StoreEntity storeEntity = storeRepository.getStore(3);
		booking.setStore(storeEntity);
		return bookingRepository.saveBooing(booking);
	}

	@Override
	public List<BookingEntity> getListBookingClause(CustomerEntity customer) {
		return bookingRepository.getBookingClause(customer);
	}
	
}
