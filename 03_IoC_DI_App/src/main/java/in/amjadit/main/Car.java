package in.amjadit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.amjadit.bean.DieselEngine;
import in.amjadit.bean.PetrolEngine;

public class Car {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Khan.xml");
		
		PetrolEngine pe1 = context.getBean(PetrolEngine.class);
		System.out.println(pe1.hashCode());
		
		PetrolEngine pe = context.getBean(PetrolEngine.class);
		System.out.println(pe.hashCode()); // its return same object 
		
		DieselEngine de1 = context.getBean(DieselEngine.class);
		System.out.println(de1.hashCode());
		
	}

}
