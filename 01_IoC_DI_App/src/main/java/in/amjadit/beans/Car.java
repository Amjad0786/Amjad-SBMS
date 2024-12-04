package in.amjadit.beans;

public class Car {

	private IEngine eng;
	
	public Car() {
		System.out.println("Car Class :: Constructor");
	}

	public void setEng(IEngine eng) {
		System.out.println("setEng Method() called....");
		this.eng = eng; // here Setter Injection is inject
	}

	public void drive() {
		int status = eng.start();
		if(status >= 1) {
			System.out.println("Journey Started");
		}else {
			System.out.println("Engine InTrouble");
		}
		
	}
}
