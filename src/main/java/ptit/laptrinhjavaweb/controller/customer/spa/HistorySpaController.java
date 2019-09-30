package ptit.laptrinhjavaweb.controller.customer.spa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ptit.laptrinhjavaweb.service.IBookingService;

@Controller
@RequestMapping("/customer")
public class HistorySpaController {
	
	@Autowired
	IBookingService bookingService;
	
	@RequestMapping("/history")
	public String showHistory() {
		return "customer/make-spa/history-customer";
	}
}
