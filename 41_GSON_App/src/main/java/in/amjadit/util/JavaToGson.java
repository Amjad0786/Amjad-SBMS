package in.amjadit.util;

import java.io.File;

import com.google.gson.Gson;

import in.amjadit.binding.Address;
import in.amjadit.binding.Pessenger;

public class JavaToGson {

	public static void main(String[] args) throws Exception {

		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TG");
		addr.setCountry("India");

		Pessenger pessenger = new Pessenger();

		pessenger.setName("Amjad");
		pessenger.setFrom("Hyd");
		pessenger.setTo("Delhi");
		pessenger.setGender("Male");
		pessenger.setAddr(addr);

		Gson gson = new Gson();
		String json = gson.toJson(pessenger);
		System.out.println(json);
		
		System.out.println("Done...");
		
		
	}
}
