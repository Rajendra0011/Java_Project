package interFace;

public class demo_Class implements Demo_InterFace{

	public void m() {
		System.out.println("defination provided");
	}

	public void m1() {
		System.out.println("defination provided");
	}

	public static void main(String[] args) {

		demo_Class d = new demo_Class();
		d.m();
		d.m1();

	}

}
