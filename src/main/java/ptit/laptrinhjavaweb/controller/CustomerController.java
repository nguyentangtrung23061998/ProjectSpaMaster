package ptit.laptrinhjavaweb.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ptit.laptrinhjavaweb.dto.EmployeeServiceV;
import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.EmployeeEntity;
import ptit.laptrinhjavaweb.entity.EmployeeServiceEntity;
import ptit.laptrinhjavaweb.entity.GalleryEntity;
import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.entity.StorekeeperEntity;
import ptit.laptrinhjavaweb.repository.IAuthRepository;
import ptit.laptrinhjavaweb.repository.IBookingRepository;
import ptit.laptrinhjavaweb.repository.IEmployeeServiceRepository;
import ptit.laptrinhjavaweb.repository.IGalleryReposiory;
import ptit.laptrinhjavaweb.service.IBookingService;
import ptit.laptrinhjavaweb.service.IBookingStatusService;
import ptit.laptrinhjavaweb.service.ICustomerService;
import ptit.laptrinhjavaweb.service.IEmployeeService;
import ptit.laptrinhjavaweb.service.IEmpoyeeServiceService;
import ptit.laptrinhjavaweb.service.IGalleryService;
import ptit.laptrinhjavaweb.service.IServiceService;
import ptit.laptrinhjavaweb.service.IStoreService;
import ptit.laptrinhjavaweb.service.impl.BookingService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	@Autowired
	private IEmployeeService employeeService;

	@Autowired
	private IEmpoyeeServiceService employeeServiceService;

	@Autowired
	private IEmployeeServiceRepository employeeServiceRe;

	@Autowired
	private IServiceService serviceService;

	@Autowired
	private IGalleryService galleryService;

	@Autowired
	private IAuthRepository authService;

	@Autowired
	private IBookingService bookingService;
	
	@Autowired
	private IStoreService storeService;
	
	@Autowired
	private IBookingStatusService bookingStatusService;
	
//	
//	@GetMapping("/test")
//	public List<CustomerEntity> getCustomer(){
//		List<CustomerEntity> customers =  customerService.getCustomers();
//		List<StorekeeperEntity> storekeeper = new ArrayList<>();
//		for(CustomerEntity customer: customers) {
//			storekeeper.add(customer.getStorekeeper());
//		}
//		return customers;
//	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginCustomer() {
		return "customer/login/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginCus(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model, HttpServletRequest req, HttpServletResponse res) throws ServletException {
		String msg = "";
//		boolean isValid = authService.findUser(username, password);
//		HttpSession session =req.getSession();
//		if (isValid) {
//			return "redirect:/customer/make-spa";
//		}
		CustomerEntity cus = authService.findUser(username, password);
		HttpSession session = req.getSession();
		System.out.println(cus);
		try {
			if (cus != null) {
				session.setAttribute("customer",cus);
				
				return "redirect:/customer/make-spa";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/customer/make-spa";
	}

	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String RegisterCustomer(Model model) {
		model.addAttribute("customer", new CustomerEntity());
		return "customer/login/sign-up";
	}

	
	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String successRegisterCustomer(@ModelAttribute("customer") CustomerEntity customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customer/sign-up";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String showAbout(Model model) {
		List<ServiceEntity> listServices = serviceService.getServices();
		model.addAttribute("services", listServices);
		List<EmployeeEntity> listEmployees = employeeService.getEmployees();
		model.addAttribute("employees", listEmployees);
		return "customer/pages/about";
	}

	@RequestMapping(value = "/portfolio", method = RequestMethod.GET)
	public String showPortfolio(Model model) {
		List<GalleryEntity> listGallery = galleryService.getGalleryService();
		model.addAttribute("galleries", listGallery);
		return "customer/pages/portfolio";
	}

	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public String showBlog(Model model) {

		return "customer/pages/blog";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String showContact(Model model) {

		return "customer/pages/contact";
	}

	@RequestMapping(value = "/single", method = RequestMethod.GET)
	public String showSingle(Model model) {
		return "customer/pages/single";
	}

	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHome(Model model) {
		List<EmployeeEntity> listEmployees = employeeService.getEmployees();
//		List<EmployeeServiceEntity> listEmployeeServiceEntities = employeeServiceService.getEmployeeServices();
//		List<EmployeeServiceEntity> employeeService = employeeServiceRe.getEmployeeServices();

//		System.out.println(listEmployeeServiceEntities);
		model.addAttribute("employees", listEmployees);
		return "customer/pages/index";
	}
	
	

	@RequestMapping("checkout")
	public String showCheckout() {
		return "customer/pages/check-out";
	}
}
