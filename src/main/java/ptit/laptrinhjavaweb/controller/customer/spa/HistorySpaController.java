package ptit.laptrinhjavaweb.controller.customer.spa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.BookingStatusEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.service.IBookingService;
import ptit.laptrinhjavaweb.service.IBookingStatusService;

@Controller
@RequestMapping("/customer")
public class HistorySpaController {
	
	@Autowired
	IBookingService bookingService;
	
	@Autowired
	private IBookingStatusService bookingStatusService;
	
	@RequestMapping(value="/history",method=RequestMethod.GET)
	public String showHistory(HttpServletRequest req,Model model) {
		HttpSession session = req.getSession();
		CustomerEntity customer = (CustomerEntity) session.getAttribute("customer");
		System.out.println(customer);
		customer.getId();
		//xử lí dữ liệu service
		if(customer != null) {
			List<BookingEntity> booking = bookingService.getListBookingClause(customer);
			model.addAttribute("booking",booking);
			return "customer/make-spa/history-customer";
		}else{
			return "customer/make-spa/login";
		}
	}
	
	@RequestMapping(value="/history/update",method=RequestMethod.GET)
	public String updateBooking(@RequestParam("bookingId") int theId) {
		BookingEntity booking = bookingService.getBooking(theId);
		BookingStatusEntity bookingStatus = bookingStatusService.getBookingStatusParam(4);
		booking.setBookingStatus(bookingStatus);
		bookingService.saveBooing(booking);
		return "redirect:/customer/history";
	}
	
}
