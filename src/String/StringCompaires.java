package String;

public class StringCompaires {


	public static void main(String[] args) {

		String s="Rajendra";
		String s1="Rajendra";

		String s3= new String("Rajendra");

		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s==s3);
		System.out.println(s.equals(s3));

	}

}
