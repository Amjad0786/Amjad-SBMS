package in.amjadit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.amjadit.binding.Customer;

@RestController
public class CustomerRestContoller {
	
	@GetMapping(
			value="/customer",
			produces= {"application/xml" , "application/json"}
			)
	public Customer getCustomer() {
		
		Customer c = new Customer();
		c.setName("Amjad Khan");
		c.setEmail("amjadkhan44734@gmail.com");
		c.setGender("Male");
		
		return c;
	}

	@PostMapping(
		value="/customer",
		consumes = {"application/xml" , "application/json"},
		produces = {"text/plain"}
		)
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		
		System.out.println(customer);
		return new ResponseEntity<>("Customer Saved" , HttpStatus.CREATED);
	}
}
