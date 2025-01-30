package in.amjadit.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.amjadit.request.Passenger;
import in.amjadit.response.Ticket;

@RestController
public class ERailRestController {
	
	private Map<Integer , Ticket> tickets = new HashMap<>();
	
	@PostMapping(
			value= "/ticket",
			consumes = {"application/xml" ,"application/json"},
			produces = {"application/xml" ,"application/json"}
			)
	public  Ticket BookTicket(@RequestBody Passenger passenger) {
		
		//Logic to book ticket 
		
		Ticket t = new Ticket();
		
		Random r = new Random();
		int ticketId = r.nextInt();
		
		t.setTicketId(ticketId);
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setTicketStatus("CONFIRMED");
		t.setTrainNum(passenger.getTrainNum());
		t.setTicketCost("1500.00INR");
		
		tickets.put(ticketId, t);
		
		return t;
	}
	@GetMapping(
			value="/ticket/{ticketId}",
			produces= {"application/xml", "application/json"}
			)
	public Ticket getTicket(@PathVariable Integer ticketId) {
		System.out.println(tickets);
		if(tickets.containsKey(ticketId)) {
			return tickets.get(ticketId);
		}
		return null; 
	}

}
