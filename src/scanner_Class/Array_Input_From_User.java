package scanner_Class;

import java.util.Scanner;

public class Array_Input_From_User {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements :");
		int n= sc.nextInt();

		int a []= new int[n];

		System.out.println("Enter "+n+" Integers");

		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		sc.close();
	}

}
