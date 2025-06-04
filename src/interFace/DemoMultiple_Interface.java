package interFace;

public class DemoMultiple_Interface implements I1,I2{

			public void m1() {
				System.out.println("Test");
			}
			public void m2() {
				System.out.println("Test");
			}
			public void m3() {
				System.out.println("Test m");
			}

			public static void main(String[] args) {

				DemoMultiple_Interface I= new DemoMultiple_Interface();
				I.m1();
				I.m2();
				I.m3();
			}


}
