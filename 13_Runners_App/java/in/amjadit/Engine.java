package in.amjadit;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine :: Constructor");
	}
	@PostConstruct
	public void init() {
		System.out.println("init method - Called");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("destory method - called");
	}
}

