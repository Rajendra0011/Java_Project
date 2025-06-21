package String_Logical_Programs;

import java.util.Scanner;

public class PollindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String org = sc.nextLine();
		String rev = "";

		for (int i = org.length() - 1; i >= 0; i--) {

			rev = rev + org.charAt(i);

		}

		if (org.equalsIgnoreCase(rev)) {

			System.out.println("String is Pollindrome" + org);
		} else {
			System.out.println("String is Not Pollindrome" + org);
		}

		sc.close();
	}

}
