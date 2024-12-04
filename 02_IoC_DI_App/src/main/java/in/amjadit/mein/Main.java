package in.amjadit.mein;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 
import in.amjadit.beans.Car;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * BeanFactory beanFactory = new xmlBeanFactory(new
		 * ClassPathResource("Beans.xml"));
		 */
		
		System.out.println("ApplicationContext Started ");

		
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		  
		  Car bean = context.getBean("petrolcar", Car.class); 
		  bean.drive();
		 

		
	}

}
