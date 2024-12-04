package in.amjadit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.amjadit.util.PwdUtil;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		System.out.println(context.getClass().getName());
	}
	
	@Bean
	public PwdUtil getInstance() {
		
		//logic
		return new PwdUtil();
	}

}
