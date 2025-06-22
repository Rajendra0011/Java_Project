package logical_programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("Before swap : a = " + a + ", b = " + b);


//		Method 1 : 	Without using temp variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap  : a = " + a + ", b = " + b);
		System.out.println("*******************************");
//		Method 1 : With using temp variable

		int x = 40;
		int y = 50;

		int temp = x;
		x = y;
		y = temp;

		System.out.println("Before swap : x = " + x + ", y = " + y);
		System.out.println("After swap  : x = " + x + ", y = " + y);
		System.out.println("*******************************");
	}

}
