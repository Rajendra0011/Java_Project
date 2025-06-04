package generalization;

public class Airtel implements SimCard{

	public void Sms() {
		System.out.println("Airtel SMS per Month: 500");
	}
	public void AudioCall() {
		System.out.println("Airtel Audio call per Month: 4000");
	}
	public void InterNet() {
		System.out.println("Airtel interNet per Month: 10 GB");
	}

}
