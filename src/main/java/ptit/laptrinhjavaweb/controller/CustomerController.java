package ptit.laptrinhjavaweb.controller;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.EmployeeEntity;
import ptit.laptrinhjavaweb.entity.GalleryEntity;
import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.repository.IAuthCustomerRepository;
import ptit.laptrinhjavaweb.service.ICustomerService;
import ptit.laptrinhjavaweb.service.IEmployeeService;
import ptit.laptrinhjavaweb.service.IGalleryService;
import ptit.laptrinhjavaweb.service.IServiceService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;

	@Autowired
	private IEmployeeService employeeService;

	@Autowired
	private IServiceService serviceService;

	@Autowired
	private IGalleryService galleryService;

	@Autowired
	private IAuthCustomerRepository authService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginCustomer() {
		return "customer/login/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginCus(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model, HttpServletRequest req, HttpServletResponse res) throws ServletException {
		String msg = "";
		CustomerEntity cus = authService.findUser(username, password);
		HttpSession session = req.getSession();
		System.out.println(cus);
		try {
			if (cus != null) {
				session.setAttribute("customer",cus);
				
				return "redirect:/customer/make-spa";
			}else {
				return "redirect:/customer/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/customer/home";
	}

	@RequestMapping(value = "/sign-up", method = RequestMethod.GET)
	public String RegisterCustomer(Model model) {
		model.addAttribute("customer", new CustomerEntity());
		return "customer/login/sign-up";
	}

	
	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public String successRegisterCustomer(@Valid @ModelAttribute("customer") CustomerEntity customer,BindingResult result) {
		if(result.hasErrors()) {
			return "customer/login/sign-up";
		}else {
			customerService.saveCustomer(customer);
			return "redirect:/customer/sign-up";
		}
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
