package abstract_Concrete_Class;

public class Concrete_Class extends Abstract_Class {

	void m1() {

		System.out.println("Competed method in Concrete Class");
	}

	void m2() {

		System.out.println("Competed method in Concrete Class");
	}

	public static void main(String[] args) {

		Concrete_Class cl = new Concrete_Class();
		cl.m1();
		cl.m2();
		cl.m3();
	}

}
