package ptit.laptrinhjavaweb.controller.customer.spa;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class ProfileCustomer {

	@Autowired
	private ICustomerService customerService;
	
	// profile
	@RequestMapping(value = "profile", method = RequestMethod.GET)
	public String showProfile(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		CustomerEntity customer = (CustomerEntity) session.getAttribute("customer");
		System.out.println(customer);
		model.addAttribute("customer", customer);
		model.addAttribute("updateProfile",new CustomerEntity());
		return "customer/make-spa/profile-customer";
	}
	
	@RequestMapping(value = "profile", method = RequestMethod.POST)
	public String updateProfile(HttpServletRequest req,@ModelAttribute("updateProfile") CustomerEntity customer) {
		HttpSession session = req.getSession();
		CustomerEntity customerNew = (CustomerEntity) session.getAttribute("customer");
		customer.setModifieddate(new Timestamp(System.currentTimeMillis()));
		customer.setId(customerNew.getId());
		customer.setCreatedDate(customerNew.getCreatedDate());
		customer.setModifiedBy(customer.getUsername());
		customerService.saveCustomer(customer);
		if(customer != null) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("customer", customer);
			return "redirect:/customer/profile";
		}
		else {
			return "customer/make-spa/profile-customer";
		}
	}
}
