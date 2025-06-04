package this_Super_Keyword;

public class Dog  extends Animal{

	String color="Black";

	void display() {
		System.out.println(super.color);
	}
	void eat() {
//		System.out.println("eating bread.....");
		super.eat();
	}

}
