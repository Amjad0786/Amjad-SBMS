package in.amjadit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {
		
		return "Welcome To Amjad IT....!!";
	}
	
	@GetMapping("/greet")
	@ResponseBody
	public String getGreetMsg() {
		return "Good Evining...!!";
		
	}

}
