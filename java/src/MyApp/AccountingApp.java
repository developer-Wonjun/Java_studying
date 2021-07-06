package MyApp;

class Accountingg {

	public double valueOfSupply;
	
	public static double vatRate = 0.1;
	public Accountingg(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	public double getVAT() {
		return valueOfSupply * vatRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp {

	public static void main(String[] args) {

		Accountingg ac = new Accountingg(10000.0);
		Accountingg ac2 = new Accountingg(30000.0);
		System.out.println("Value of supply :" + ac.valueOfSupply);
		System.out.println("VAT :" + ac.getVAT());
		System.out.println("Total :" + ac.getTotal());
		System.out.println("-------------------------------------");
		System.out.println("Value of supply :" + ac2.valueOfSupply);
		System.out.println("VAT :" + ac2.getVAT());
		System.out.println("Total :" + ac2.getTotal());
	}
}
