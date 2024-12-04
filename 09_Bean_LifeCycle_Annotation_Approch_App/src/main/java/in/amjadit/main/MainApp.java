package in.amjadit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.amjadit.bean.Motor;

public class MainApp {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("New-Bean.xml");
		
		Motor motor = context.getBean(Motor.class);
		motor.doWork();
		
		ConfigurableApplicationContext cfgtxt = (ConfigurableApplicationContext)context;
		
		//By Using this we closing the IOC container 
		cfgtxt.registerShutdownHook();
		cfgtxt.close();
	}


}
