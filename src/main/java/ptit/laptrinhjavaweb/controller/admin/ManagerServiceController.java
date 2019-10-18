package ptit.laptrinhjavaweb.controller.admin;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.service.IServiceService;

@Controller
@RequestMapping("/admin")
public class ManagerServiceController {

	@Autowired
	IServiceService serviceService;

	@Autowired
	ServletContext context;

	@RequestMapping(value = "/service", method = RequestMethod.GET)
	public String showService(Model model) {
		model.addAttribute("service", new ServiceEntity());
		List<ServiceEntity> getServices = serviceService.getServices();
		model.addAttribute("services", getServices);
		return "admin/pages/service";
	}

	@RequestMapping(value = "/service", method = RequestMethod.POST)
	public String postService(Model model, @Valid @ModelAttribute("service") ServiceEntity service,
			BindingResult result, @RequestParam("image") MultipartFile img) {
		System.out.println(service);
		if (result.hasErrors()) {
			model.addAttribute("modelOpen","yes");
			List<ServiceEntity> getServices = serviceService.getServices();
			model.addAttribute("services", getServices);
		} else {
			if (img.isEmpty()) {
				model.addAttribute("message", "Pleased choose file image");
				return "admin/pages/service";
			} else {
				try {
					String photoPath = context.getRealPath("./files/" + img.getOriginalFilename());
					img.transferTo(new File(photoPath));
					service.setImagePath(img.getOriginalFilename());
					serviceService.saveService(service);
					return "redirect:/admin/service";
				} catch (Exception e) {
					e.printStackTrace();
				}

				return "redirect:/admin/service";
			}
		}
		return "admin/pages/service";

	}

	@RequestMapping(value = "/service/delete", method = RequestMethod.GET)
	public String deleteCustomer(@RequestParam("serviceId") int theId) {
		serviceService.deleteService(theId);
		return "redirect:/admin/service";
	}

	@RequestMapping(value = "/service/update", method = RequestMethod.POST)
	public String updateService(Model model, @ModelAttribute("service") ServiceEntity service,@RequestParam("image") MultipartFile img) {
		Integer id = service.getId();
		ServiceEntity ser = serviceService.getService(id);
		System.out.println(ser);

		if (ser != null) {
			if(!img.getOriginalFilename().equals("")) {
				try {
					String photoPath = context.getRealPath("./files/" + img.getOriginalFilename());
					img.transferTo(new File(photoPath));
					service.setImagePath(img.getOriginalFilename());
				}catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				service.setImagePath(ser.getImagePath());
			}
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
