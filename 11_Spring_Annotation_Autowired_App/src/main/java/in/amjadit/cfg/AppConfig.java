package in.amjadit.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"in.amjadit"})
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}

}
