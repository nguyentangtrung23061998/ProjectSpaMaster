package ptit.laptrinhjavaweb.controller.customer.spa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.service.IBookingService;

@Controller
@RequestMapping("/customer")
public class HistorySpaController {
	
	@Autowired
	IBookingService bookingService;
	
	@RequestMapping("/history")
	public String showHistory(HttpServletRequest req,Model model) {
		HttpSession session = req.getSession();
		CustomerEntity customer = (CustomerEntity) session.getAttribute("customer");
		//xử lí dữ liệu service
		List<BookingEntity> booking = bookingService.getListBookingClause(customer);
		model.addAttribute("booking",booking);
		System.out.println(booking);
		return "customer/make-spa/history-customer";
	}
}
