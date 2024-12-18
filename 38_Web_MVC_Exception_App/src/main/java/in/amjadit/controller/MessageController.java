package in.amjadit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {

	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {

		int i = 10 / 0;
		String msg = "Welcome To Amjad IT world...!!";
		return msg;
	}

	@GetMapping("/greet")
	@ResponseBody
	public String getGreetMsg() {
		String msg = "Good Evening..!!";
		return msg;
	}

	
}
