package in.amjadit.bean;

public class App {

	private IEngine eng;

	public void setEng(IEngine eng) {
		System.out.println("setEng Method() Called...");
		this.eng = eng;
	}

	public App() {
		System.out.println("No Param :: Constructor ");
	}

	public App(IEngine eng) {
		System.out.println("Param :: Constructor ");
		this.eng = eng;
	}
	
	public void Drive() {
		int status = eng.start();
		if(status <= 1) {
			System.out.println("Engine Started");
		}else {
			System.out.println("Engine Trouble");
		}
	}

}
