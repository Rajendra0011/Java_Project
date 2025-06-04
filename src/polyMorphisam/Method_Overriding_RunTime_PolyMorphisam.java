package polyMorphisam;

class Bank {

	double roi() {

		return 0;
	}
}

class ICICI extends Bank {

	double roi() {
		return 10.5;
	}
}

class SBI extends ICICI {

	double roi() {
		return 11.5;
	}
}

public class Method_Overriding_RunTime_PolyMorphisam {

	public static void main(String[] args) {

		Bank b= new Bank();
		System.out.println("RBI rate of Intrest : "+b.roi());

		ICICI ic = new ICICI();
		System.out.println("ICICI rate of Intrest : "+ic.roi());

		SBI sb = new SBI();
		System.out.println("SBI rate of Intrest : "+sb.roi());

	}

}
