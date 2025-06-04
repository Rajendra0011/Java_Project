package enCapsulation;

public class Main_Class {

	public static void main(String args[]) {

		Encapsulation enc = new Encapsulation();
		enc.setAccon(1001);
		enc.setAmmount(20000);
		enc.setName("Rajendra Karhale");

		System.out.println("Account Number : " + enc.getAccon());
		System.out.println("Account Balance : " + enc.getAmmount());
		System.out.println("Account Holder Name : " + enc.getName());
	}

}
