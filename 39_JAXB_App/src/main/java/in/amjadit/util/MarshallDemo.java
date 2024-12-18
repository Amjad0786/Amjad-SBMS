package in.amjadit.util;

import java.io.File;

import in.amjadit.binding.Address;
import in.amjadit.binding.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class MarshallDemo {

	
	public static  void main(String[] args)throws Exception {
		
		Address addr = new Address();
		addr.setCity("Ghazipur");
		addr.setState("UttarPerdesh");
		addr.setCountry("India");
		
		Person p = new Person();
		p.setId(101);
		p.setName("Amjad");
		p.setGender("Male");
		p.setEmail("amjadkhan44@gmail.com");
		p.setAddr(addr);
		
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(p, new File("person.xml"));
            
            System.out.println("done...");
	}
}
