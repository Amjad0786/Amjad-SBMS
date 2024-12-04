package in.amjadit.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.amjadit.beans.Motor;
import in.amjdit.config.AppConfig;


public class MainApp {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Motor motor = context.getBean(Motor.class);
		System.out.println(motor.hashCode());
		
	    Motor motor2 = context.getBean(Motor.class);
	    System.out.println(motor2.hashCode());
	}

}
