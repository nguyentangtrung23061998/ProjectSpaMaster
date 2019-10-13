package ptit.laptrinhjavaweb.controller.API;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.BookingStatusEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.repository.IBookingRepository;
import ptit.laptrinhjavaweb.repository.impl.BookingRepository;

@RestController
@RequestMapping("/booking")
public class BookingRestController {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private IBookingRepository bookingRepository;

//	@GetMapping("/{id}")
//	public BookingEntity booking(@PathVariable Integer id) {
////		BookingEntity booking = bookingRepository.g
//		return bookingRepository.getBooking(id);
//	}


}
