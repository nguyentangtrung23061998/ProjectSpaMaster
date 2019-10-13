package ptit.laptrinhjavaweb.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.BookingStatusEntity;
import ptit.laptrinhjavaweb.service.IBookingService;
import ptit.laptrinhjavaweb.service.IBookingStatusService;

@Controller
@RequestMapping("/admin")
public class AppointmentController {
	@Autowired
	private IBookingService bookingService;
	
	@Autowired
	private IBookingStatusService bookingStatusService;
	
	@RequestMapping(value="/appointment",method=RequestMethod.GET)
	public String showAppointment(Model model) {
		List<BookingEntity> booking = bookingService.getBooking();
		model.addAttribute("booking",booking);
		return "admin/pages/appointment";
	}
	
	@RequestMapping(value="/appointment/success",method=RequestMethod.GET)
	public String successAppointment(@RequestParam("bookingId") int theId) {
		BookingEntity booking = bookingService.getBooking(theId);
		System.out.println(booking);
		BookingStatusEntity bookingStatus = bookingStatusService.getBookingStatusParam(3);
		booking.setBookingStatus(bookingStatus);
		bookingService.saveBooing(booking);
		return "redirect:/admin/appointment";
	}
	
	@RequestMapping(value="/appointment/canceled",method=RequestMethod.GET)
	public String deleteAppointment(@RequestParam("bookingId") int theId) {
		BookingEntity booking = bookingService.getBooking(theId);
		System.out.println(booking);
		BookingStatusEntity bookingStatus = bookingStatusService.getBookingStatusParam(2);
		booking.setBookingStatus(bookingStatus);
		bookingService.saveBooing(booking);
		return "redirect:/admin/appointment";
	}
}
