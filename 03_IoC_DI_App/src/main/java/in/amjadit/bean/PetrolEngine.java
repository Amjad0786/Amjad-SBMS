package in.amjadit.bean;

public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("Petrol Engine Constructor");
	}
	
	@Override
	public int start() {
		System.out.println("Petrol Engine Start..");
		return 1;
	}
	

}
