package week3.day2.assignments;

public class Automation extends MultipleLanguages implements TestTool {

	public void Java() {
		System.out.println("Java");
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void Ruby() {
		System.out.println("Ruby");
		
	}

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		
		auto.Java();
		auto.Selenium();
		auto.Python();
		auto.Ruby();

	}
}
