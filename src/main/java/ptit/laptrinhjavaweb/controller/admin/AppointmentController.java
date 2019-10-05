package ptit.laptrinhjavaweb.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.service.IBookingService;

@Controller
@RequestMapping("/admin")
public class AppointmentController {
	@Autowired
	private IBookingService bookingService;
	
	@RequestMapping(value="/appointment",method=RequestMethod.GET)
	public String showAppointment(Model model) {
		List<BookingEntity> booking = bookingService.getBooking();
		model.addAttribute("booking",booking);
		return "admin/pages/appointment";
	}
}
