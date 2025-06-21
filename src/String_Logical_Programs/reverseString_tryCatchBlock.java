package String_Logical_Programs;

public class reverseString_tryCatchBlock {

	public static void main(String args[]) {

		String s = "Rajendra Karhale";
		String rev = "";

		try {

			for (int i = s.length() - 1; i >= 0; i--) {
				rev = rev + s.charAt(i);
			}
			System.out.println(rev);
		} catch (Exception e) {

			System.out.println("get error message" + e.getMessage());
			e.printStackTrace();
		}

	}
}
