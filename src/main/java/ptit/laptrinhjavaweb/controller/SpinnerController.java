package ptit.laptrinhjavaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpinnerController {
	@RequestMapping("/home")
	public String spinner() {
		return "spinner/spinner";
	}
	
}
