package polyMorphisam;

public class CompileTime_polyMorphisam {

	int a = 10;
	int b = 20;

	void add() {

		System.out.println("addition of two number : " +( a + b));
	}

	void add(int x, int y) {

		System.out.println("Addition of two number : " + (x + y));

	}

	void add(double x, int y) {
		System.out.println("Addition of two number : " +(x + y));
	}

	void add(int x, double y) {
		System.out.println("Addition of two number : "+(x + y));
	}

	void add(int x, int y, int z) {
		System.out.println("Addition of three number :"+ (x + y + z));
	}

}
