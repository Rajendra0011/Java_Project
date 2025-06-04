package generalization;

public class Main_Class {
	public static void main(String[] args) {

		Airtel a= new Airtel();
		a.Sms();
		a.AudioCall();
		a.InterNet();
	System.out.println("===========================================");
		VI v= new VI();
		v.Sms();
		v.AudioCall();
		v.InterNet();
		System.out.println("===========================================");
		Jio j= new Jio();
		j.Sms();
		j.AudioCall();
		j.InterNet();
	}

}
