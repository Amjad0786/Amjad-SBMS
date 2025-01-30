package in.amjadit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.amjadit.GreetFiegnClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFiegnClient greetFiegnClient; 
	
	@Autowired 
	private Environment environment;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String port = environment.getProperty("server.port");
		
		String welcomeMsg = "Welcome To Amjad World..!! (" + port + ")";
		
		String greetMsg = greetFiegnClient.invokeGreetApi();
		
		return greetMsg +  " , "  + welcomeMsg;
	}

}
