package in.amjadit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.amjadit.beans.Car;

public class App {
	
	public static void main(String[] args) {
		
		
		//starting IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
	
		   Car car = context.getBean(Car.class);
		   car.drive();
	}

}
