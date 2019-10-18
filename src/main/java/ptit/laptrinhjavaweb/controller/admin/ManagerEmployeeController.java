package ptit.laptrinhjavaweb.controller.admin;

import java.io.File;
import java.io.IOException;
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

import ptit.laptrinhjavaweb.entity.EmployeeEntity;
import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.service.IEmployeeService;

@Controller
@RequestMapping("/admin")
public class ManagerEmployeeController {

	@Autowired
	IEmployeeService employeeService;

	@Autowired
	ServletContext context;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String getEmployeeaca(Model model) {
		List<EmployeeEntity> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		model.addAttribute("employee", new EmployeeEntity());
		return "admin/pages/employee";
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String saveEmployee(Model model, @Valid @ModelAttribute("employee") EmployeeEntity employee,
			BindingResult result, @RequestParam("image") MultipartFile img) {
		if (result.hasErrors()) {
			model.addAttribute("modelOpen","yes");
			List<EmployeeEntity> employees = employeeService.getEmployees();
			model.addAttribute("employees", employees);
		} else {
			if (img.isEmpty()) {
				model.addAttribute("message", "Pleased choose file image");
				return "admin/pages/employee";
			} else {
				try {
					String photoPath = context.getRealPath("./files/" + img.getOriginalFilename());
					img.transferTo(new File(photoPath));
					employee.setImagepath(img.getOriginalFilename());
					employeeService.saveEmployee(employee);
					return "redirect:/admin/employee";
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			return "admin/pages/employee";
		}
		return "admin/pages/employee";
	}

	@RequestMapping(value = "/employee/delete", method = RequestMethod.GET)
	public String deleteCustomer(@RequestParam("employeeId") int theId) {
		employeeService.deleteEmployee(theId);
		return "redirect:/admin/employee";
	}

	@RequestMapping(value = "/employee/update", method = RequestMethod.POST)
	public String updateService(Model model, @ModelAttribute("employee") EmployeeEntity employee,@RequestParam("image") MultipartFile img) {
		Integer id = employee.getId();
		EmployeeEntity empl = employeeService.getEmployee(id);
		System.out.println(empl);

		if (empl != null) {
			if(!img.getOriginalFilename().equals("")) {
				try {
					String photoPath = context.getRealPath("./files/" + img.getOriginalFilename());
					img.transferTo(new File(photoPath));
					employee.setImagepath(img.getOriginalFilename());
				}catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				employee.setImagepath(empl.getImagepath());
			}
			
			employee.setCreatedBy(empl.getCreatedBy());
			employee.setCreatedDate(empl.getCreatedDate());
			employee.setModifiedBy(empl.getModifiedBy());
			employee.setModifieddate(empl.getModifieddate());
			employee.setStore(empl.getStore());
		}
		if (employee != null) {
			EmployeeEntity employeeUpdate = employeeService.updateEmployee(employee);
			System.out.println(employeeUpdate);
		}
		return "redirect:/admin/employee";
	}
}
