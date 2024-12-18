package in.amjadit.util;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.amjadit.binding.Passenger;

public class JsonToJava {
	
	public static void main(String[] args) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		Passenger passenger = mapper.readValue(new File("passenger.json"), Passenger.class);
		
		System.out.println(passenger);
	}

}
