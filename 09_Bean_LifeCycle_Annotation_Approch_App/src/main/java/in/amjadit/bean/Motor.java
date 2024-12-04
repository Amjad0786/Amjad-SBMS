package in.amjadit.bean;

public class Motor {

	@PostConstruct
	public Motor() {
		System.out.println("Motor :: Constructor...");
	}
	
	public void start() {
		System.out.println("Motor Started .....");
		
	}
	
	public void doWork() {
		System.out.println("Motor Pulling Water...");
	}
	@PreDestroy
	public void stop() {
		System.out.println("Motor Stopped....");
	}
	
	
}
