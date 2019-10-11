package ptit.laptrinhjavaweb.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.service.IServiceService;

@Controller
@RequestMapping("/admin")
public class ManagerServiceController {

	@Autowired 
	IServiceService serviceService;
	
	@RequestMapping(value="/service",method=RequestMethod.GET)
	public String showService(Model model) {
		model.addAttribute("service", new ServiceEntity());
		List<ServiceEntity> getServices = serviceService.getServices();
		model.addAttribute("services",getServices);
		return "admin/pages/service";
	}
	
	@RequestMapping(value="/service",method=RequestMethod.POST)
	public String postService(Model model, @ModelAttribute("service") ServiceEntity service) {
		System.out.println(service);
		serviceService.saveService(service);
		return "redirect:/admin/service";
	}
	
	@RequestMapping(value = "/service/delete", method = RequestMethod.GET)
	public String deleteCustomer(@RequestParam("serviceId") int theId) {
		serviceService.deleteService(theId);
		return "redirect:/admin/service";
	}
	

	@RequestMapping(value = "/service/update", method = RequestMethod.POST)
	public String updateService(Model model, @ModelAttribute("service") ServiceEntity service) {
		Integer id = service.getId();
		ServiceEntity ser = serviceService.getService(id);
		System.out.println(ser);
		
		if (ser != null) {
			service.setCreatedBy(ser.getCreatedBy());
			service.setCreatedDate(ser.getCreatedDate());
			service.setModifiedBy(ser.getModifiedBy());
			service.setModifieddate(ser.getModifieddate());
		}
		if (service != null) {
			ServiceEntity serviceUpdate = serviceService.updateService(service);
			System.out.println(serviceUpdate);
		}
		return "redirect:/admin/service";
	}
	
}
