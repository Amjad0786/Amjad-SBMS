package in.amjadit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcomes")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to SamSoft");
		mav.setViewName("index");
		
		
		return mav;
	}
	
	@GetMapping("/greets")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Hii Good Morning...");
		mav.setViewName("index");
		
       return mav;
		
	}

}