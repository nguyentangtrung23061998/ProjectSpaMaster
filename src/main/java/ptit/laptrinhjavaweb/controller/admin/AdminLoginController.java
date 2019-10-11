package ptit.laptrinhjavaweb.controller.admin;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ptit.laptrinhjavaweb.entity.CustomerEntity;
import ptit.laptrinhjavaweb.entity.StorekeeperEntity;
import ptit.laptrinhjavaweb.service.IAuthAdminService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {

	@Autowired
	IAuthAdminService authAdminService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginCustomer() {
		return "admin/pages/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model, HttpServletRequest req, HttpServletResponse res) throws ServletException {
		StorekeeperEntity admin = authAdminService.storeKeeper(username, password);
		HttpSession session = req.getSession();
		System.out.println(admin);
		try {
			if (admin != null) {
				session.setAttribute("admin",admin);
				
				return "redirect:/admin/appointment";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/admin/login";
	}
	
}
