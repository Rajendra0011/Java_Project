package Constructor;

public class Constructor_Main {

	public static void main(String args[]) {

		Constructor_Oveloading con= new Constructor_Oveloading();
//		con.volume();
		System.out.println(con.volume());

		Constructor_Oveloading con1= new Constructor_Oveloading(10, 10, 10);
//		con1.volume();
		System.out.println(con1.volume());

		Constructor_Oveloading con2= new Constructor_Oveloading(20);
//		con2.volume();
		System.out.println(con2.volume());
	}

}
