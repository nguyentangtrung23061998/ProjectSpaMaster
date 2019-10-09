package ptit.laptrinhjavaweb.controller.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {


	@Autowired
	private ICustomerService customerService;
	
	@GetMapping(value = "/customers")
	public List<CustomerEntity> showCustomer(Model model) {
		return customerService.getCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public CustomerEntity getCustomer(@PathVariable Integer id) {
		CustomerEntity cus =customerService.getCustomer(id);
		return cus;
	}
	
}
