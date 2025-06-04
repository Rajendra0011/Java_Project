package enCapsulation;

public class Encapsulation {

	private int accon;
	public int getAccon() {
		return accon;
	}
	public void setAccon(int accon) {
		this.accon = accon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	private String name;
	private double ammount;

}
