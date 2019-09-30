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

import ptit.laptrinhjavaweb.dto.BookingStatus;
import ptit.laptrinhjavaweb.entity.BookingEntity;
import ptit.laptrinhjavaweb.entity.BookingStatusEntity;
import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.entity.StoreEntity;
import ptit.laptrinhjavaweb.service.IBookingService;
import ptit.laptrinhjavaweb.service.IBookingStatusService;
import ptit.laptrinhjavaweb.service.ICustomerService;
import ptit.laptrinhjavaweb.service.IServiceService;
import ptit.laptrinhjavaweb.service.IStoreService;

@Controller
@RequestMapping("/customer")
public class BookingSpaController {
	
	@Autowired
	private ICustomerService customerService;
	
	@Autowired
	private IBookingService bookingService;
	
	@Autowired
	private IStoreService storeService;
	
	@Autowired
	private IBookingStatusService bookingStatusService;
	
	@Autowired
	private IServiceService serviceService;

	
	@RequestMapping(value = "/make-spa", method = RequestMethod.GET)
	public String showMakeSpa(Model model,HttpServletRequest req) {
		HttpSession session = req.getSession();
		model.addAttribute("booking", new BookingEntity());
		List<ServiceEntity> listService = serviceService.getServices();
		model.addAttribute("service", listService);
		CustomerEntity cus2 = (CustomerEntity) session.getAttribute("customer");
		System.out.println(cus2);
		return "customer/make-spa/make-spa";
	}
	


	@RequestMapping(value = "/make-spa", method = RequestMethod.POST)
	public String postMakeSpa(@RequestParam("bookingDate") String date, @RequestParam("service") Integer idService,
			@RequestParam("hour") Integer hour, @RequestParam("minutes") Integer minutes, Model model,HttpServletRequest req) {
		//xử lí dữ liệu session customer
		HttpSession session = req.getSession();
		CustomerEntity cus2 = (CustomerEntity) session.getAttribute("customer");
		//xử lí dữ liệu service
		ServiceEntity service = serviceService.getService(idService);
		//xử lí booking
		BookingEntity bookingEntity = new BookingEntity();
		Integer totalMinutes = hour * 60 + minutes;
		String handleTime = hour + "-" + minutes;
		bookingEntity.setBookingDate(date);
		
		bookingEntity.setMinutes(totalMinutes);
		bookingEntity.setStartTime(handleTime);
		//xử lí service
		bookingEntity.setService(service);
		//xử lí customer
		bookingEntity.setCustomer(cus2);
		//xử lí booking status
		BookingStatusEntity bookingStatus = bookingStatusService.getBookingStatusDefault();
		bookingEntity.setBookingStatus(bookingStatus);
		
		StoreEntity store = storeService.getStore(3);
		bookingEntity.setStore(store);
		
		bookingEntity.setEndTime("13");
		bookingService.saveBooing(bookingEntity);
		// return "customer/make-spa/make-spa";
		return "redirect:/customer/make-spa";
	}
}
