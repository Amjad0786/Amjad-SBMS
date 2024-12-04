package in.amjadit.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class DemoController {

	@GetMapping("/date")
	   public ModelAndView getTodayDate() {
		   
		   ModelAndView mav = new ModelAndView();
		   
		   LocalDate now = LocalDate.now();
		   
		   String msgtxt ="Today date is"+ now;
		   mav.addObject("msg",msgtxt);
		   mav.setViewName("index");
		   
		return mav;
		   
		   
	   }
}
