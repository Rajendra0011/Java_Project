package String;

public class VowelsConsonents_Counts {

	public static void main(String args[]) {

		String s = "Rajendra Karhale";
		String input = s.toLowerCase();
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') 
			{
				vowels++;
			} else if ((ch >= 'a' && ch <= 'z')) {

				consonants++;
			}
		}
		System.out.println("total vowels in string " + vowels);
		System.out.println("total vowels in consonants " + consonants);

	}

}
