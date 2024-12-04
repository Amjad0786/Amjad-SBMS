package in.amjadit.beans;

public class Car {

	private IEngine eng;

	public void setEng(IEngine eng) {
		System.out.println("setEng Method () called..");
		this.eng = eng;
	}

	public Car() {
		System.out.println("Non Param :: Constracutor");
	}

	public Car(IEngine eng) {
		System.out.println("Param :: Constructor");
		this.eng = eng;
	}

	public void drive() {
		int status = eng.start();
		if (status >= 1) {
			System.out.println("Engine Started");
		} else {
			System.out.println("Engine Trouble");
		}
	}

}
