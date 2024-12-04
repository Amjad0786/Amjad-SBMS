package in.amjadit.beans;

public class Car {
	
	private IEngine eng;
	
	public void setEng(IEngine eng) {
		System.out.println("setEng Method() called");
		this.eng = eng;
	}
	
	public Car() {
	System.out.println("Zero Param Constructor");	
	}
	
	public Car(IEngine eng) {
		System.out.println("Param Constuctor");
		this.eng = eng;
	}
	
	public void drive() {
		int status = eng.start();
		if(status >= 1) {
			System.out.println("Engine Started...");
		}else {
			System.out.println("Engine Trouble");
		}
	}
		

}
