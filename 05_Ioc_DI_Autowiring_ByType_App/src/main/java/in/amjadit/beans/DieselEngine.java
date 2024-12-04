package in.amjadit.beans;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("Diesel Engine :: Constructors");
	}
	
	 @Override
	public int start() {
		System.out.println("DieselEngine");
		return 1;
	}
	
}
