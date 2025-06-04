package scanner_Class;

import java.util.Scanner;

public class Scanner_Class {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("addition of Two number : "+(a+b));
		sc.close();

	}

}
