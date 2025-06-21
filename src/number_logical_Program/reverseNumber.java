package number_logical_Program;

public class reverseNumber {

	public static void main(String args[]) {

		int num=121;
		int rev=0;
		int org=num;
		while(num>0) {

			int temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);

		if(org==rev) {

			System.out.println("Number is pollindrome");
		}
		else {
			System.out.println("Number is not pollindrome");
		}
	}

}
