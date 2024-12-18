package in.amjadit.util;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.amjadit.binding.Address;
import in.amjadit.binding.Passenger;

public class JavaToJson {

	public static void main(String[] args) throws Exception {
		
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");
		

		Passenger passenger = new Passenger();

		passenger.setName("Amjad");
		passenger.setFrom("Hyd");
		passenger.setTo("Delhi");
		passenger.setGender("Male");
		passenger.setAddr(addr);

		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("passenger.json"), passenger);
		System.out.println("done..");

	}
}
