package ptit.laptrinhjavaweb.controller.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.service.IServiceService;

@RestController
@RequestMapping("/service")
public class ServiceRestController {

	@Autowired
	IServiceService service;
	
	@GetMapping("/services/{id}")
	public ServiceEntity getService(@PathVariable Integer id) {
		return  service.getService(id);
	}
	
}
