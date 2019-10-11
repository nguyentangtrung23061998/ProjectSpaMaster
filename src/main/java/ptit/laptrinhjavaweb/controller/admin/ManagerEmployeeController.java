package ptit.laptrinhjavaweb.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ptit.laptrinhjavaweb.entity.EmployeeEntity;
import ptit.laptrinhjavaweb.entity.ServiceEntity;
import ptit.laptrinhjavaweb.service.IEmployeeService;

@Controller
@RequestMapping("/admin")
public class ManagerEmployeeController {

	@Autowired
	IEmployeeService employeeService;
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public String getEmployeeaca(Model model) {
		List<EmployeeEntity> employees = employeeService.getEmployees();
		model.addAttribute("employees",employees);
		model.addAttribute("employee",new EmployeeEntity());
		return "admin/pages/employee";
	}
	
	@RequestMapping(value="/employee",method=RequestMethod.POST)
	public String saveEmployee(Model model, @ModelAttribute("employee") EmployeeEntity employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/admin/employee";
	}
	
	@RequestMapping(value = "/employee/delete", method = RequestMethod.GET)
	public String deleteCustomer(@RequestParam("employeeId") int theId) {
		employeeService.deleteEmployee(theId);
		return "redirect:/admin/employee";
	}
	
	@RequestMapping(value = "/employee/update", method = RequestMethod.POST)
	public String updateService(Model model, @ModelAttribute("employee") EmployeeEntity employee) {
		Integer id = employee.getId();
		EmployeeEntity empl = employeeService.getEmployee(id);
		System.out.println(empl);
		
		if (empl != null) {
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
