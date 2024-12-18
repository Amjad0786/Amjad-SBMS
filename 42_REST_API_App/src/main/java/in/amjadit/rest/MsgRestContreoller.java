package in.amjadit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestContreoller {
	
	public MsgRestContreoller() {
		System.out.println("MsgRestController:: Contructor");
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		String msg = "Welcome To Amjad IT...!!";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = "Good Evening...!!";
		return msg;
	}
		
	

}
