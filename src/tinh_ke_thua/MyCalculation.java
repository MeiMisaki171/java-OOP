package tinh_ke_thua;

public class MyCalculation extends Calculation {
	
	public void phepNhan(int a, int b) {
		c = a*b;
		System.out.println("Tich hai so = "+c);
	}
	
	public void phepChia (int a, int b) {
		c=a/b;
		System.out.println("Thuong hai so = "+c);
	}
	
	public static void main(String[] args) {
		int a=12, b= 6;
		MyCalculation myCalculation = new MyCalculation();
		myCalculation.phepCong(a, b);
		myCalculation.phepTru(a, b);
		myCalculation.phepNhan(a, b);
		myCalculation.phepChia(a, b);
	}
}
