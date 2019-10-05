package ptit.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ManagerAppointment {
	
	@RequestMapping("/customer")
	public String showCustomer() {
		return "admin/pages/customer";
	}
	
}
