package ptit.laptrinhjavaweb.controller.admin;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.EmployeeEntity;
import ptit.laptrinhjavaweb.repository.IAuthCustomerRepository;
import ptit.laptrinhjavaweb.service.ICustomerService;
import ptit.laptrinhjavaweb.service.impl.CustomerService;

@Controller
@RequestMapping("/admin")
public class ManagerCustomerController {

	@Autowired
	private ICustomerService customerService;

	@Autowired
	private IAuthCustomerRepository authRepository;

	@RequestMapping("/customer")
	public String showCustomer() {
		return "admin/pages/customer";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String showCustomer(Model model) {
		model.addAttribute("customer", new CustomerEntity());
		List<CustomerEntity> listCus = customerService.getCustomers();
		model.addAttribute("listCus", listCus);
		return "admin/pages/customer";
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String successRegisterCustomer(Model model,@Valid @ModelAttribute("customer") CustomerEntity customer,BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("modelOpen","yes");
			List<CustomerEntity> listCus = customerService.getCustomers();
			model.addAttribute("listCus", listCus);
			return "admin/pages/customer";
			
		}else {
			customerService.saveCustomer(customer);
			return "redirect:/admin/customer";
		}
	}

	@RequestMapping(value = "/customer/update", method = RequestMethod.POST)
	public String getCustomerId(Model model, @ModelAttribute("customer") CustomerEntity customer) {
		Integer id = customer.getId();
		CustomerEntity cus = customerService.getCustomer(id);
		System.out.println(cus);
		
		if (cus != null) {
			customer.setCreatedBy(cus.getCreatedBy());
			customer.setCreatedDate(cus.getCreatedDate());
			customer.setModifiedBy(cus.getModifiedBy());
			customer.setModifieddate(cus.getModifieddate());
			customer.setToken(cus.getToken());
		}
		if (customer != null) {
			CustomerEntity customerUpdate = customerService.updateCustomer(customer);
			System.out.println(customerUpdate);
		}
		return "redirect:/admin/customer";
	}

	@RequestMapping(value = "/customer/delete", method = RequestMethod.GET)
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		customerService.deleteCustomer(theId);
		return "redirect:/admin/customer";
	}
}
