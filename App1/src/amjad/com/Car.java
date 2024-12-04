package amjad.com;

public class Car {
	
	private IEngine eng ;
	
	public void setEng(IEngine eng) {
		this.eng = eng;  // hear Setter Injection is inject 
	}
	
	public Car(IEngine eng) {
		
		this.eng = eng; //hear Constructor  Injection is Inject
	}
	
	
	
	public void  drive () {
		int start = eng.start();
		
		if(start >= 1) {
			
			System.out.println("Journey Started");
		}else {
			System.out.println("Engine InTrouble");
		}
		
	}

}
