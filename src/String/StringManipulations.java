package String;

public class StringManipulations {

	public static void main(String[] args) {

			String s= "The rains have started here";
			String s1= "The rains have Started here";

			System.out.println(s.length());
			System.out.println(s.charAt(5));
			System.out.println(s.indexOf('s'));
			System.out.println(s.indexOf('s', s.indexOf('s')+1));
			System.out.println(s.indexOf("have"));
			System.out.println(s.indexOf("Hellow"));
			System.out.println(s.indexOf("Thes"));

			System.out.println(s.equals(s1));
			System.out.println(s.equalsIgnoreCase(s1));
			System.out.println(s.substring(0, 8));
			System.out.println(s.substring(10));

			String s2= "    Rajendra hellooo   ";
			System.out.println(s2.trim());

			System.out.println(s2.replace(" ", ""));

			String s3= "Hello_world_Test_Selenium";
			String[] testval = s3.split("_");

			for(int i=0;i<testval.length;i++) {
				System.out.print(testval[i]+" ");
			}
			String s4="cares";
			System.out.println(s4.concat("t"));
	}

}
