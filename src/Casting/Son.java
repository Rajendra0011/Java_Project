package Casting;

public class Son extends Father{

	public void car() {
		System.out.println("Honda city");
	}
	public void Money() {
		System.out.println("7 lakh");
	}
	public void Home() {
		System.out.println("3 BHK");
	}

	public void mobile() {
		System.out.println("Iphone");
	}


	public static void main(String[] args) {

		Father s = new Son();
		s.car();
		s.Money();
		s.Home();

	}

}
